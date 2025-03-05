public class MahasiswaMain03 {
    public static void main(String[] args) {
        Mahasiswa03 mhs1 = new Mahasiswa03("2441720171", "Muhammad Ali Farhan", 2022);

        System.out.println("Data Mahasiswa Awal:");
        mhs1.tampilkanInfo();
        System.out.println();

        MataKuliah03 mk3 = new MataKuliah03("MT101", "Matematika Lanjut", 3);
        mhs1.tambahMataKuliah(mk3);

        System.out.println("Setelah Menambahkan Mata Kuliah:");
        mhs1.tampilkanInfo();
    }
}
