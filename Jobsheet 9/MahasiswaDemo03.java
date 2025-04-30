import java.util.Scanner;

public class MahasiswaDemo03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa03 stack = new StackTugasMahasiswa03(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Mahasiswa Pertama Mengumpulkan tugas");
            System.out.println("6. Melihat Jumlah Tugas yang Terkumpul");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa03 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.printf("Menilai tugas dari %s\n", dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break; 
                case 3:
                    Mahasiswa03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } 
                    break;
                case 4:
                    System.out.println("Daftar Tugas Mahasiswa:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    System.out.println("Mahasiswa pertama yang mengumpulkan tugas:");
                    Mahasiswa03 terbawah = stack.bottom();
                    if (terbawah != null) {
                    System.out.printf("%s\t%s\t%s\n", terbawah.nama, terbawah.nim, terbawah.kelas);
                    }
                    break;
                case 6:
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan: %d\n", stack.count());
                    break;
                    case 7:
                    System.out.println("Keluar dari program.");
                    break;                
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }

        } while (pilih >= 1 && pilih <= 6);

        scan.close();
    }
}
