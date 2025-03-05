public class Mahasiswa03 {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah03[] matkulDiambil;
    int jumlahMK;

    public Mahasiswa03(String nim, String nm, int thnMsk) {
        this.nim = nim;
        this.nama = nm;
        this.tahunMasuk = thnMsk;
        this.matkulDiambil = new MataKuliah03[10];
        this.jumlahMK = 0;
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Mata Kuliah Diambil: ");
        for (int i = 0; i < jumlahMK; i++) {
            matkulDiambil[i].tampilkanInfo();
        }
    }

    public void tambahMataKuliah(MataKuliah03 mataKuliah) {
        if (jumlahMK < matkulDiambil.length) {
            matkulDiambil[jumlahMK] = mataKuliah;
            jumlahMK++;
        } else {
            System.out.println("Mata kuliah penuh");
        }
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalSKS += matkulDiambil[i].sks;
        }
        return totalSKS;
    }
}
