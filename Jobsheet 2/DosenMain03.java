public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "D021";
        dosen1.nama = "Dr. Raka Wirasena";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2012;
        dosen1.bidangKeahlian = "Keamanan Siber";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Forensik Digital");
        dosen1.tampilInformasi();
        System.out.println();

        Dosen03 dosen2 = new Dosen03("D032", "Prof. Nayla Ardiani", true, 2008, "Pengolahan Citra Digital");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Deep Learning");
        dosen2.tampilInformasi();
    }
}
