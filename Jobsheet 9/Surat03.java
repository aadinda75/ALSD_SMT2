public class Surat03 {
    String idSurat;
    String namaMhs;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat03(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMhs = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("ID Surat     : " + idSurat);
        System.out.println("Nama         : " + namaMhs);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + (jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
        System.out.println("Durasi Izin  : " + durasi + " hari");
    }

    public String getNamaMahasiswa() {
        return namaMhs;
    }
}
