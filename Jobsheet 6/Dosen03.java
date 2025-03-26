class Dosen03 {
    String nidn;
    String nama;
    int usia;

    Dosen03(String nidn, String nama, int usia) {
        this.nidn = nidn;
        this.nama = nama;
        this.usia = usia;
    }

    void tampilInformasi() {
        System.out.println("NIDN  : " + nidn);
        System.out.println("Nama  : " + nama);
        System.out.println("Usia  : " + usia);
    }
}
