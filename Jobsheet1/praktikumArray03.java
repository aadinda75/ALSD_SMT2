import java.util.Scanner;

public class praktikumArray03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================================================");
        System.out.println("                             PROGRAM MENGHITUNG IP SEMESTER                           ");
        System.out.println("======================================================================================");

        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};

        int sks = 2;
        int totalSKS = sks * matkul.length;

        double[] angka = new double[matkul.length];
        String[] huruf = new String[matkul.length];
        double[] nilai = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
            angka[i] = sc.nextDouble();

            if (angka[i] > 80 && angka[i] <= 100) {
                huruf[i] = "A";
                nilai[i] = 4.0;
            } else if (angka[i] > 73 && angka[i] <= 80) {
                huruf[i] = "B+";
                nilai[i] = 3.5;
            } else if (angka[i] > 65 && angka[i] <= 73) {
                huruf[i] = "B";
                nilai[i] = 3.0;
            } else if (angka[i] > 60 && angka[i] <= 65) {
                huruf[i] = "C+";
                nilai[i] = 2.5;
            } else if (angka[i] > 50 && angka[i] <= 60) {
                huruf[i] = "C";
                nilai[i] = 2.0;
            } else if (angka[i] > 39 && angka[i] <= 50) {
                huruf[i] = "D";
                nilai[i] = 1.0;
            } else {
                huruf[i] = "E";
                nilai[i] = 0.0;  
            }            
        }

        double totalNilai = 0;
        
        for (int i = 0; i < matkul.length; i++) {
            totalNilai += nilai[i] * sks;
        }

        double ipSmt = totalNilai / totalSKS;

        System.out.println("\n======================================================================================");
        System.out.println("                              Hasil Konversi Nilai                                    ");
        System.out.println("======================================================================================");

        System.out.printf("%-40s %-7s %-12s %-12s %-7s%n", "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-7d %-12.1f %-12s %-7.1f%n", matkul[i], sks, angka[i], huruf[i], nilai[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Total SKS: %d%n", totalSKS);
        System.out.printf("IP Semester: %.2f%n", ipSmt);

        sc.close();
    }
}
