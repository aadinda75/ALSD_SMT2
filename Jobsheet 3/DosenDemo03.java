import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 dataDosen = new DataDosen03(); 

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        Dosen03[] arrayOfDosen = new Dosen03[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();

            String jenisKelaminStr;
            boolean jenisKelamin = true;
            while (true) {
                System.out.print("Jenis Kelamin (Pria/Wanita): ");
                jenisKelaminStr = sc.nextLine().trim().toLowerCase();
                if (jenisKelaminStr.equals("pria")) {
                    jenisKelamin = true;
                    break;
                } else if (jenisKelaminStr.equals("wanita")) {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input tidak valid! Masukkan 'Pria' atau 'Wanita'.");
                }
            }

            System.out.print("Usia         : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen03(kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------------");
        }

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
