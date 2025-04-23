import java.util.Scanner;

public class Siakad {
    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
    static MataKuliah[] daftarMatkul = new MataKuliah[3];
    static Nilai[] daftarNilai = new Nilai[5];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        isiData();
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tampilkanDaftarMahasiswa(); 
                break;
                case 2: tampilkanDaftarMataKuliah(); 
                break;
                case 3: tampilkanDataPenilaian(); 
                break;
                case 4: urutkanBerdasarkanNilaiAkhir(); 
                break;
                case 5: cariMahasiswaByNIM(); 
                break;
                case 0: System.out.println("Keluar dari program."); 
                break;
                default: System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilihan != 0);
    }

    static void isiData() {
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi", "Teknik Komputer");

        daftarMahasiswa[0] = m1;
        daftarMahasiswa[1] = m2;
        daftarMahasiswa[2] = m3;

        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("K003", "Desain Web", 2);

        daftarMatkul[0] = mk1;
        daftarMatkul[1] = mk2;
        daftarMatkul[2] = mk3;

        daftarNilai[0] = new Nilai(m1, mk1, 80, 85, 90);
        daftarNilai[1] = new Nilai(m1, mk2, 70, 65, 75);
        daftarNilai[2] = new Nilai(m2, mk1, 85, 80, 70);
        daftarNilai[3] = new Nilai(m3, mk2, 90, 85, 95);
        daftarNilai[4] = new Nilai(m3, mk3, 80, 90, 85);
    }

    static void tampilkanMenu() {
        System.out.println("=== MENU SISTEM AKADEMIK ===");
        System.out.println("1. Tampilkan Daftar Mahasiswa");
        System.out.println("2. Tampilkan Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
    }

    static void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanMahasiswa();
        }
    }

    static void tampilkanDaftarMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : daftarMatkul) {
            mk.tampilkanMataKuliah();
        }
    }

    static void tampilkanDataPenilaian() {
        System.out.println("Data Penilaian:");
        for (Nilai n : daftarNilai) {
            n.tampilkanNilai();
        }
    }

    static void urutkanBerdasarkanNilaiAkhir() {
        for (int i = 0; i < daftarNilai.length - 1; i++) {
            for (int j = 0; j < daftarNilai.length - i - 1; j++) {
                if (daftarNilai[j].hitungNilaiAkhir() < daftarNilai[j + 1].hitungNilaiAkhir()) {
                    Nilai temp = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = temp;
                }
            }
        }
        System.out.println("\nData setelah diurutkan berdasarkan nilai akhir:");
        tampilkanDataPenilaian();
    }

    static void cariMahasiswaByNIM() {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = input.nextLine();
        boolean ditemukan = false;
    
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.nim.equals(nimCari)) {
                System.out.println("Mahasiswa Ditemukan:");
                m.tampilkanMahasiswa();
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
}