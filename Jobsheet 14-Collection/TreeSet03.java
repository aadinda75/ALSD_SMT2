import java.util.TreeSet;

public class TreeSet03 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        System.out.println("Isi TreeSet (terurut otomatis):");
        for (String temp : fruits) {
            System.out.println(temp);
        }

        System.out.println("\nFirst : " + fruits.first());
        System.out.println("Last  : " + fruits.last());

        //menghapus elemen tertentu
        fruits.remove("Jeruk");
        System.out.println("\nSetelah remove \"Jeruk\" : " + fruits);

        //menghapus elemen pertama 
        fruits.pollFirst();
        System.out.println("Setelah pollFirst()       : " + fruits);

        //menghapus elemen terakhir 
        fruits.pollLast();
        System.out.println("Setelah pollLast()        : " + fruits);
    }
}
