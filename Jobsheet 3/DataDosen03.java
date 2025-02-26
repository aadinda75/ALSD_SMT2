public class DataDosen03 {

    public void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen03 dosen : arrayOfDosen) {
            System.out.println("Kode         : " + dosen.kode);
            System.out.println("Nama         : " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dosen.usia);
            System.out.println("-----------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahDosenPria = 0, jumlahDosenWanita = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahDosenPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahDosenWanita++;
            }
        }

        double rataPria = (jumlahDosenPria > 0) ? (double) totalUsiaPria / jumlahDosenPria : 0;
        double rataWanita = (jumlahDosenWanita > 0) ? (double) totalUsiaWanita / jumlahDosenWanita : 0;

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria   : " + (jumlahDosenPria > 0 ? rataPria : "Tidak ada data"));
        System.out.println("Wanita : " + (jumlahDosenWanita > 0 ? rataWanita : "Tidak ada data"));
    }

    public void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen03 dosenTertua = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode         : " + dosenTertua.kode);
        System.out.println("Nama         : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + dosenTertua.usia);
    }

    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen03 dosenTermuda = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode         : " + dosenTermuda.kode);
        System.out.println("Nama         : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenTermuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + dosenTermuda.usia);
    }
}
