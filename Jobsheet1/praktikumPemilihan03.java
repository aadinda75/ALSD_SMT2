import java.util.Scanner;

public class praktikumPemilihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        boolean valid = true;
        
        System.out.println("=========================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================================");
        
        System.out.print("Masukkan Nilai Tugas  = ");
        tugas = input.nextDouble();
        if (tugas < 0 || tugas > 100) {
            valid = false;
        }

        System.out.print("Masukkan Nilai Kuis   = ");
        kuis = input.nextDouble();
        if (kuis < 0 || kuis > 100) {
            valid = false;
        }

        System.out.print("Masukkan Nilai UTS    = ");
        uts = input.nextDouble();
        if (uts < 0 || uts > 100) {
            valid = false;
        }

        System.out.print("Masukkan Nilai UAS    = ");
        uas = input.nextDouble();
        if (uas < 0 || uas > 100) {
            valid = false;
        }
        
        System.out.println("=========================================");
        System.out.println("=========================================");
        
        if (!valid) {
            System.out.println("Nilai tidak valid!");
            System.out.println("=========================================");
            System.out.println("=========================================");
            input.close(); 
            return;
        }
        
        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        
        String nilaiHuruf;
        double nilaiSetara;
        String kualifikasi;
        String status;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
            status = "MAAF ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal";
            status = "MAAF ANDA TIDAK LULUS";
        }
        
        System.out.println("Nilai akhir  = " + nilaiAkhir);
        System.out.println("Nilai huruf  = " + nilaiHuruf);
        System.out.println("Nilai setara = " + nilaiSetara);
        System.out.println("Kualifikasi  = " + kualifikasi);
        
        System.out.println("=========================================");
        System.out.println("=========================================");
        
        System.out.println(status);
        
        System.out.println("=========================================");
        System.out.println("=========================================");
        
        input.close(); 
    }
}
