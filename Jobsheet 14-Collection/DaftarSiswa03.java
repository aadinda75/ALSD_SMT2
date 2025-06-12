import java.util.ArrayList;
import java.util.Collections;

public class DaftarSiswa03 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);

        System.out.println("Daftar Siswa (diurutkan):");
        System.out.println(daftarSiswa);
    }
}