public class Mahasiswa03 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nm, String nim, double ipk, String kls) { 
        this.nama = nm; 
        this.nim = nim;
        this.ipk = ipk; 
        this.kelas = kls;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    public void updateIPK(double ipkBaru) { 
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        } else {
            this.ipk = ipkBaru;
        }
    }

    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}