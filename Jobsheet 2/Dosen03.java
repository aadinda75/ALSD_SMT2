public class Dosen03 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen03() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    public Dosen03(String idDsn, String nm, boolean sttsAktf, int thnBergabung, String bdngKeahlian) {
        this.idDosen = idDsn;
        this.nama = nm;
        this.statusAktif = sttsAktf;
        this.tahunBergabung = thnBergabung;
        this.bidangKeahlian = bdngKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen      : " + idDosen);
        System.out.println("Nama          : " + nama);
        System.out.println("Status Aktif  : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
