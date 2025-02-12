import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================================================================");
        System.out.println("                           PROGRAM MENGHITUNG IP SEMESTER                           ");
        System.out.println("====================================================================================");

        String[] matkul = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int sks = 2, totalSKS = sks * matkul.length;
        double totalNilai = 0;

        double[] angka = new double[matkul.length];
        String[] huruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
            angka[i] = input.nextDouble();
            
            if (angka[i] > 80) {
                huruf[i] = "A"; bobotNilai[i] = 4.0;
            } else if (angka[i] > 73) {
                huruf[i] = "B+"; bobotNilai[i] = 3.5;
            } else if (angka[i] > 65) {
                huruf[i] = "B"; bobotNilai[i] = 3.0;
            } else if (angka[i] > 60) {
                huruf[i] = "C+"; bobotNilai[i] = 2.5;
            } else if (angka[i] > 50) {
                huruf[i] = "C"; bobotNilai[i] = 2.0;
            } else if (angka[i] > 39) {
                huruf[i] = "D"; bobotNilai[i] = 1.0;
            } else {
                huruf[i] = "E"; bobotNilai[i] = 0.0;
            }

            totalNilai += bobotNilai[i] * sks;
        }

        double ipSemester = totalNilai / totalSKS;

        System.out.println("\n===================================================================================");
        System.out.println("                            Hasil Konversi Nilai                                    ");
        System.out.println("====================================================================================");
        System.out.printf("%-40s %-4s %-12s %-12s %-5s%n", "\nMata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-7d %-12s %-12s %-5.1f%n", matkul[i], sks, angka[i], huruf[i], bobotNilai[i]);
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("IP Semester: %.2f%n", ipSemester);
        
        input.close();
    }
}
