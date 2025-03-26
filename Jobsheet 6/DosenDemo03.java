import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataDosen03 data = new DataDosen03(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("NIDN : ");
            String nidn = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------------------------"); 
            data.tambah(new Dosen03(nidn, nama, usia));
        }

        System.out.println("\nDaftar Dosen:");
        data.tampil();

        System.out.println("\nMasukkan nama dosen yang dicari: ");
        String cariNama = sc.nextLine();
        data.pencarianDataSequential(cariNama);

        int cariUsia;
        int posisi;
        do {
            System.out.println("\nMasukkan usia dosen yang dicari: ");
            cariUsia = sc.nextInt();
            posisi = data.pencarianDataBinary(cariUsia);
            data.tampilPosisiUsia(cariUsia, posisi);
            if (posisi == -1) {
                System.out.println("Silakan masukkan usia yang benar!");
            }
        } while (posisi == -1);

        sc.close();
    }
}
  