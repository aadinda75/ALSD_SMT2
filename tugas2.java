import java.util.Scanner;

public class tugas2 {

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        System.out.println("=== Kalkulator Kubus ===");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih opsi: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuPilihan;
        
        do {
            tampilkanMenu();
            menuPilihan = input.nextInt();
            
            if (menuPilihan >= 1 && menuPilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = input.nextDouble();
                
                switch (menuPilihan) {
                    case 1:
                        System.out.println("Volume: " + hitungVolume(sisiKubus));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan: " + hitungLuasPermukaan(sisiKubus));
                        break;
                    case 3:
                        System.out.println("Keliling: " + hitungKeliling(sisiKubus));
                        break;
                }
            } else if (menuPilihan != 4) {
                System.out.println("Pilihan tidak valid, silakan pilih opsi yang benar.");
            }
        } while (menuPilihan != 4);
        
        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}
