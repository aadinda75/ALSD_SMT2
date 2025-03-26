public class MahasiswaBerprestasi03 {
    Mahasiswa03[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi03(int jumlah) { 
        listMhs = new Mahasiswa03[jumlah];
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void tambah(Mahasiswa03 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data mahasiswa penuh!");
        }
    }

    int sequentialSearching(double cari) {
        for (int j = 0; j < idx; j++) { 
            if (listMhs[j] != null && listMhs[j].ipk == cari) {
                return j;
            }
        }
        return -1;
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk > listMhs[j + 1].ipk) {
                    Mahasiswa03 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
            if (listMhs[mid].ipk < cari) { 
                return findBinarySearch(cari, mid + 1, right); 
            }
            return findBinarySearch(cari, left, mid - 1);
        }
        return -1;
    }
    
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
