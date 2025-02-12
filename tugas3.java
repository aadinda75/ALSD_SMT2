import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah matkul: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] namaMatkul = new String[n];
        int[] SKS = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMatkul ke-" + (i+1));
            System.out.print("Nama matkul: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            SKS[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
        
        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari matkul berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n=====================================");
                    System.out.println(" Menampilkan seluruh jadwal kuliah: ");
                    System.out.println("=====================================");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Matkul: " + namaMatkul[i]);
                        System.out.println("SKS: " + SKS[i]);
                        System.out.println("Semester: " + semester[i]);
                        System.out.println("Hari kuliah: " + hariKuliah[i]);
                        System.out.println("----------------------------");
                    }
                    break;
                
                case 2:
                    System.out.print("\nMasukkan hari kuliah (misalnya 'Senin', 'Selasa'): ");
                    String hari = scanner.nextLine();
                    boolean found = false;
                    System.out.println("\n==========================================");
                    System.out.println(" Menampilkan jadwal kuliah pada hari " + hari + ":");
                    System.out.println("==========================================");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println("Matkul: " + namaMatkul[i]);
                            System.out.println("SKS: " + SKS[i]);
                            System.out.println("Semester: " + semester[i]);
                            System.out.println("----------------------------");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
                    }
                    break;
                
                case 3:
                    System.out.print("\nMasukkan semester: ");
                    int smstr = scanner.nextInt();
                    found = false;
                    System.out.println("\n===========================");
                    System.out.println("Menampilkan jadwal kuliah pada semester " + smstr + ":");
                    System.out.println("===========================");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == smstr) {
                            System.out.println("Matkul: " + namaMatkul[i]);
                            System.out.println("SKS: " + SKS[i]);
                            System.out.println("Hari kuliah: " + hariKuliah[i]);
                            System.out.println("----------------------------");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada jadwal kuliah pada semester " + smstr);
                    }
                    break;
                
                case 4:
                    System.out.print("\nMasukkan nama matkul yang dicari: ");
                    String cariNama = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMatkul[i].equalsIgnoreCase(cariNama)) {
                            System.out.println("\n===========================");
                            System.out.println("Matkul ditemukan:");
                            System.out.println("===========================");
                            System.out.println("Matkul: " + namaMatkul[i]);
                            System.out.println("SKS: " + SKS[i]);
                            System.out.println("Semester: " + semester[i]);
                            System.out.println("Hari kuliah: " + hariKuliah[i]);
                            System.out.println("----------------------------");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Matkul dengan nama " + cariNama + " tidak ditemukan.");
                    }
                    break;
                
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
