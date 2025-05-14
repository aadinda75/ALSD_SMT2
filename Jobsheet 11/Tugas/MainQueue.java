package Tugas;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList();
        int pilih;

        do {
            System.out.println("\n=== Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    queue.enqueue(new Mahasiswa(nim, nama));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println(queue.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 4:
                    System.out.println(queue.isFull() ? "Antrian penuh" : "Antrian belum penuh");
                    break;
                case 5:
                    queue.peekFront();
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 7:
                    queue.count();
                    break;
                case 8:
                    queue.display();
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
