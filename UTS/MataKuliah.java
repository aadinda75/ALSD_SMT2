public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampilkanMataKuliah() {
        System.out.println("Daftar Mata Kuliah :");
        System.out.println("Kode MK: " + kode + " | Nama: " + nama + " | SKS: " + sks);
    }
}