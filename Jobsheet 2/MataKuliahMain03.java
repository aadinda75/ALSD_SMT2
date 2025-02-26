public class MataKuliahMain03 {
    public static void main(String[] args) {
        
        MataKuliah03 mk1 = new MataKuliah03();
        mk1.kodeMK = "Daspro";   
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        System.out.println();

        MataKuliah03 mk2 = new MataKuliah03("ALSD", "Algoritma dan Struktur Data", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
        System.out.println();

        MataKuliah03 mk3 = new MataKuliah03("SISOP", "Sistem Operasi", 2, 4);
        mk3.tampilInformasi();
        mk3.ubahSKS(3);
        mk3.tambahJam(2);
        mk3.tampilInformasi();
    }
}
