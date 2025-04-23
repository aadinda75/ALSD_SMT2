public class Dosen03 {
    String nidn;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;

    public Dosen03(String nidn, String nm, String email, int thnMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nm;
        this.email = email;
        this.tahunMasuk = thnMasuk;
        this.prodi = prodi;
    }

    //Method menghitung masa kerja dosen
    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunMasuk;
    }

    //Method menampilkan data dosen
    public void tampilkanData(int tahunSekarang) {
        System.out.println(String.format("NIDN: %-10s | Nama: %-20s | Email: %-30s | Prodi: %-20s", nidn, nama, email, prodi));
    }
}
