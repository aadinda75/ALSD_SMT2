public class DataDosen03 {
    Dosen03[] daftarDosen;
    int idx = 0;

    DataDosen03(int jumlah) {
        daftarDosen = new Dosen03[jumlah];
    }

    void tambah(Dosen03 d) {
        if (idx < daftarDosen.length) {
            daftarDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            daftarDosen[i].tampilInformasi();
            System.out.println("---------------------------------------------------"); 
        }
    }

    void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (daftarDosen[i].nama.equalsIgnoreCase(nama)) {
                daftarDosen[i].tampilInformasi();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void sortUsia() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (daftarDosen[j].usia > daftarDosen[j + 1].usia) {
                    Dosen03 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
    }

    int pencarianDataBinary(int usia) {
        sortUsia();
        int left = 0, right = idx - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (daftarDosen[mid].usia == usia) {
                return mid;
            } else if (daftarDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    void tampilPosisiUsia(int usia, int posisi) {
        if (posisi != -1) {
            System.out.println("Usia '" + usia + "' ditemukan pada indeks: " + posisi);
            daftarDosen[posisi].tampilInformasi();
        } else {
            System.out.println("Usia '" + usia + "' tidak ditemukan.");
        }
    }
}
