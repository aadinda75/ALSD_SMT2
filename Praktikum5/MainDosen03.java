import java.util.Scanner;

public class MainDosen03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 data = new DataDosen03();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah dosen yang ingin ditambahkan: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jumlah; i++) {
                        if (data.idx >= 10) {
                            System.out.println("Data dosen sudah penuh!");
                            break;
                        }
                        System.out.println("Masukkan data dosen ke-" + (i + 1));
                        System.out.print("Kode         : ");
                        String kode = sc.nextLine();
                        System.out.print("Nama         : ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        System.out.print("Usia         : ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        data.tambah(new Dosen03(kode, nama, jenisKelamin, usia));
                    }
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.bubbleSortASC();
                    data.tampil();
                    break;

                case 4:
                    data.selectionSortDSC();
                    data.tampil();
                    break;

                case 5:
                    data.insertionSortDSC();
                    data.tampil();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
