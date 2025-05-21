import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        DoubleLinkedList03 list = new DoubleLinkedList03();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== Menu Double Linked List Mahasiswa =====");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan semua data");
            System.out.println("6. Cari berdasarkan NIM");
            System.out.println("7. Tambah setelah NIM tertentu");
            System.out.println("8. Tambah di indeks tertentu");
            System.out.println("9. Hapus setelah NIM tertentu");
            System.out.println("10. Hapus berdasarkan indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    Node03 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM sebagai acuan: ");
                    String key = scan.nextLine();
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.insertAfter(key, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM sebagai acuan: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 11 -> {
                    Mahasiswa03 mhs = list.getFirst();
                    if (mhs != null) mhs.tampil();
                }
                case 12 -> {
                    Mahasiswa03 mhs = list.getLast();
                    if (mhs != null) mhs.tampil();
                }
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa03 mhs = list.getIndex(index);
                    if (mhs != null) mhs.tampil();
                }
                case 14 -> {
                    System.out.println("Jumlah data dalam list: " + list.getSize());
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa03 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa03(nim, nama, kelas, ipk);
    }
}
