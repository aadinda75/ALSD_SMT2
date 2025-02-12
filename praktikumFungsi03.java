import java.util.Scanner;

public class praktikumFungsi03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int[] harga = {75000, 50000, 60000, 10000};
        
        System.out.println("=================================================================");
        System.out.println("   Pendapatan setiap cabang jika semua bunga habis terjual  ");
        System.out.println("=================================================================");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.printf("RoyalGarden %d : Rp %,d%n", (i + 1), pendapatan);
        }
        
        System.out.println("=================================================================");
        System.out.println("  Total stock setiap jenis bunga setelah pengurangan bunga mati   ");
        System.out.println("=================================================================");

        int[] stockMati = {-1, -2, -0, -5};
        int[] totalStock = new int[4];

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < stock.length; i++) {
                totalStock[j] += stock[i][j];
            }
            totalStock[j] += stockMati[j];
        }

        System.out.printf("Aglonema  : %d%n", totalStock[0]);
        System.out.printf("Keladi    : %d%n", totalStock[1]);
        System.out.printf("Alocasia  : %d%n", totalStock[2]);
        System.out.printf("Mawar     : %d%n", totalStock[3]);

        sc.close();
    }
}
