import java.util.Scanner;

public class DataDosen03 {
    Dosen03[] daftarDosen = new Dosen03[5];
    Scanner input = new Scanner(System.in);
    int tahunSekarang = 2025;

    //Data dosen
    public void isiData() {
        daftarDosen[0] = new Dosen03("02235", "Laila Putri", "laila@polinema.ac.id", 2011, "Teknik Listrik");
        daftarDosen[1] = new Dosen03("02234", "Ahmad Bagus", "bagus@polinema.ac.id", 2013, "Teknik Mesin");
        daftarDosen[2] = new Dosen03("02236", "Eko Wijaya", "eko@polinema.ac.id", 2010, "Sistem Informasi");
        daftarDosen[3] = new Dosen03("02237", "Mia Lestari", "mia@polinema.ac.id", 2018, "Teknik Kimia");
        daftarDosen[4] = new Dosen03("02238", "Bambang", "bambang@polinema.ac.id", 2015, "Informatika");
    }

    //Menampilkan semua data dosen
    public void tampilkanSemuaDosen() {
        System.out.println("Daftar Dosen:");
        for (Dosen03 d : daftarDosen) {
            d.tampilkanData(tahunSekarang);
        }
    }

    //Menampilkan masa kerja dosen
    public void tampilkanMasaKerjaDosen() {
        System.out.println("Masa Kerja Dosen:");
        for (Dosen03 d : daftarDosen) {
            System.out.println(String.format("Nama: %-20s | Masa Kerja: %-3d tahun", d.nama, d.hitungMasaKerja(tahunSekarang)));
        }
    }

    //Mengurutkan dosen berdasarkan NIDN (Ascending)
    public void urutkanBerdasarkanNIDN() {
        //Bubble Sort Ascending berdasarkan NIDN
        for (int i = 0; i < daftarDosen.length - 1; i++) {
            for (int j = 0; j < daftarDosen.length - i - 1; j++) {
                if (daftarDosen[j].nidn.compareTo(daftarDosen[j + 1].nidn) > 0) {
                    Dosen03 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan berdasarkan NIDN (Ascending).");
        tampilkanSemuaDosen();
    }

    //Mengurutkan dosen berdasarkan masa kerja (Descending)
    public void urutkanBerdasarkanMasaKerja() {
        //Bubble Sort Descending berdasarkan masa kerja
        for (int i = 0; i < daftarDosen.length - 1; i++) {
            for (int j = 0; j < daftarDosen.length - i - 1; j++) {
                if (daftarDosen[j].hitungMasaKerja(tahunSekarang) < daftarDosen[j + 1].hitungMasaKerja(tahunSekarang)) {
                    Dosen03 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan berdasarkan masa kerja (Descending).");
        System.out.println("Daftar Dosen (berdasarkan masa kerja):");
        for (Dosen03 d : daftarDosen) {
            System.out.println(String.format(
                "Nama: %-20s | Masa Kerja: %-3d tahun | NIDN: %-10s | Email: %-30s | Prodi: %-20s",
                d.nama, d.hitungMasaKerja(tahunSekarang), d.nidn, d.email, d.prodi
            ));
        }
    }

    //Mencari dosen berdasarkan nama
    public void cariDosenByNama() {
        //Linear Search
        System.out.print("Masukkan Nama Dosen yang dicari: ");
        String namaCari = input.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (Dosen03 d : daftarDosen) {
            if (d.nama.toLowerCase().equals(namaCari)) {
                System.out.println("Dosen Ditemukan:");
                d.tampilkanData(tahunSekarang);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan nama tersebut tidak ditemukan.");
        }
    }
}
