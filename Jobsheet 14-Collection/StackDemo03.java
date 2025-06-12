import java.util.Stack;
public class StackDemo03 {
    public static void main(String[] args) {
        Book03 book1 = new Book03("1234", "Dasar Pemrograman");
        Book03 book2 = new Book03("7145", "Bahasa Shalawat Delisa");
        Book03 book3 = new Book03("3562", "Muhammad Al-Fatih");

        Stack<Book03> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book03 temp = books.peek();
        if (temp != null) {
            System.out.println("Top book (peek): " + temp.toString());
        }

        Book03 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("Popped book: " + temp2.toString());
        }

        System.out.println("\nBuku pada stack:");
        for (Book03 b : books) {
            System.out.println(b.toString());
        }

        System.out.println("\nDebug output stack:");
        System.out.println(books);

        System.out.println("\nSearch book3:");
        int posisi = books.search(book3);
        if (posisi != -1) {
            System.out.println("book3 ditemukan pada posisi ke-" + posisi + " dari atas stack.");
            System.out.println("Data book3: " + book3.toString());
        } else {
            System.out.println("book3 tidak ditemukan dalam stack.");
        }


    }
}
