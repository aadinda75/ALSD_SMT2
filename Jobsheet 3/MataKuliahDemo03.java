import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        MataKuliah03[] arrayOfMatakuliah = new MataKuliah03[jumlahMatkul];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));

            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMatakuliah[i] = new MataKuliah03(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
