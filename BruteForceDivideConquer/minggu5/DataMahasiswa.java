package minggu5;

public class DataMahasiswa {
    static int cariUTSTertinggi(Mahasiswa[] mahasiswa, int l, int r) {
        if (l == r) return mahasiswa[l].uts;
        int mid = (l + r) / 2;
        int tertinggiKiri = cariUTSTertinggi(mahasiswa, l, mid);
        int tertinggiKanan = cariUTSTertinggi(mahasiswa, mid + 1, r);
        return Math.max(tertinggiKiri, tertinggiKanan);
    }

    static int cariUTSTerendah(Mahasiswa[] mahasiswa, int l, int r) {
        if (l == r) return mahasiswa[l].uts;
        int mid = (l + r) / 2;
        int terendahKiri = cariUTSTerendah(mahasiswa, l, mid);
        int terendahKanan = cariUTSTerendah(mahasiswa, mid + 1, r);
        return Math.min(terendahKiri, terendahKanan);
    }

    static double rataUAS(Mahasiswa[] mahasiswa) {
        double total = 0;
        for (Mahasiswa m : mahasiswa) total += m.uas;
        return total / mahasiswa.length;
    }

    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        System.out.println("UTS Tertinggi : " + cariUTSTertinggi(mahasiswa, 0, mahasiswa.length - 1));
        System.out.println("UTS Terendah  : " + cariUTSTerendah(mahasiswa, 0, mahasiswa.length - 1));
        System.out.println("Rata-rata UAS : " + rataUAS(mahasiswa));
    }
}