public class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    double tugas;
    double uts;
    double uas;

    public Nilai(Mahasiswa mahasiswa, MataKuliah matkul, int tugas, int uts, int uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void tampilkanNilai() {
        System.out.printf("%s | %s | Nilai: %.2f\n", mahasiswa.nama, matkul.nama, hitungNilaiAkhir());
}
}