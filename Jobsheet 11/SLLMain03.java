import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            sll.addLast(mhs);

            System.out.println("\nData setelah penambahan:");
            sll.print();
        }

        System.out.println("\nData index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa bernama Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}