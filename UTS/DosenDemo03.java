public class DosenDemo03 {
    public static void main(String[] args) {
        DataDosen03 data = new DataDosen03();
        data.isiData();

        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = data.input.nextInt();
            data.input.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    data.tampilkanSemuaDosen();
                    break;
                case 2:
                    data.tampilkanMasaKerjaDosen();
                    break;
                case 3:
                    data.urutkanBerdasarkanNIDN();
                    break;
                case 4:
                    data.urutkanBerdasarkanMasaKerja();
                    break;
                case 5:
                    data.cariDosenByNama();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);
    }

    static void tampilkanMenu() {
        System.out.println("=== MENU SISTEM DOSEN POLINEMA 03 ===");
        System.out.println("1. Tampilkan Daftar Dosen");
        System.out.println("2. Tampilkan Masa Kerja Dosen");
        System.out.println("3. Urutkan Dosen Berdasarkan NIDN");
        System.out.println("4. Urutkan Dosen Berdasarkan Masa Kerja");
        System.out.println("5. Cari Dosen Berdasarkan Nama");
        System.out.println("0. Keluar");
    }
}
