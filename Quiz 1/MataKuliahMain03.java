public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03("IF101", "Pemrograman Dasar", 3);
        MataKuliah03 mk2 = new MataKuliah03("IF102", "Struktur Data", 4);

        System.out.println("Data Mata Kuliah Awal:");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
        System.out.println();

        mk1.ubahNamaMK("Pemrograman Lanjut");
        mk2.ubahSKS(3);

        System.out.println("Setelah Perubahan:");
        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
    }
}