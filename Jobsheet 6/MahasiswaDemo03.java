import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------------------------"); 
            list.tambah(new Mahasiswa03(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("---------------------------------------------------"); 
        System.out.println("                  Pencarian data");
        System.out.println("---------------------------------------------------"); 
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String ipkStr = sc.nextLine(); 
        double cari = Double.parseDouble(ipkStr);
 
        System.out.println("===  Menggunakan sequential searching  ===");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("===  Menggunakan binary search  ===");
        int pss2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}
