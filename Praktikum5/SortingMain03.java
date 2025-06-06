public class SortingMain03 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting03 dataurut1 = new Sorting03(a, a.length);
        System.out.println("==============================================");
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        
        System.out.println("==============================================");
        int b[] = {30, 20, 2, 8, 14};
        Sorting03 dataurut2 = new Sorting03(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data setelah sorting dengan SELECTION SORT");
        dataurut2.tampil();
        
        System.out.println("==============================================");
        int c[] = {40, 10, 4, 9, 3};
        Sorting03 dataurut3 = new Sorting03(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
        System.out.println("==============================================");
    }
}
