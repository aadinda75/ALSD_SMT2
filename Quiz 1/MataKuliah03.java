public class MataKuliah03 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah03(String kodeMK, String nmMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = nmMK;
        ubahSKS(sks);
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }
}