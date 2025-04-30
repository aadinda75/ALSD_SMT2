import java.util.Stack;

public class StackSurat03 {
    private Stack<Surat03> stackSurat = new Stack<>();

    public void pushSurat(Surat03 surat) {
        stackSurat.push(surat);
        System.out.println("Surat berhasil diterima.\n");
    }

    public void prosesSurat() {
        if (!stackSurat.isEmpty()) {
            System.out.println("Memproses surat berikut:");
            Surat03 surat = stackSurat.pop();
            surat.tampilkanInfo();
        } else {
            System.out.println("Tidak ada surat untuk diproses.\n");
        }
    }

    public void lihatSuratTerakhir() {
        if (!stackSurat.isEmpty()) {
            System.out.println("Surat terakhir yang masuk:");
            stackSurat.peek().tampilkanInfo();
        } else {
            System.out.println("Stack surat kosong.\n");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat03 surat : stackSurat) {
            if (surat.getNamaMahasiswa().equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                surat.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.\n");
        }
    }
}
