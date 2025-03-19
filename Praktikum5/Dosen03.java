public class Dosen03 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen03(String kd, String nm, boolean jnsKlmn, int age) {
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jnsKlmn;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("--------------------------------------");
    }
}
