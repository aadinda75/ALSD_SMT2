import java.util.Scanner;

public class MainSurat03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat03 stackSurat = new StackSurat03();
        int pilihan;

        do {
            System.out.println("\nMENU SURAT IZIN MAHASISWA");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = input.nextInt();
                    input.nextLine(); 

                    Surat03 suratBaru = new Surat03(id, nama, kelas, jenis, durasi);
                    stackSurat.pushSurat(suratBaru);
                    break;

                case 2:
                    stackSurat.prosesSurat();
                    break;

                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = input.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
