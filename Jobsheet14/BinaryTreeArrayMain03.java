public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        BinaryTree03 bta = new BinaryTree03();  

        Mahasiswa03 mhs1 = new Mahasiswa03("244160121", "Ali", "A", 3.57);
        Mahasiswa03 mhs2 = new Mahasiswa03("244160185", "Candra", "C", 3.41);
        Mahasiswa03 mhs3 = new Mahasiswa03("244160221", "Badar", "B", 3.75);
        Mahasiswa03 mhs4 = new Mahasiswa03("244160220", "Dewi", "B", 3.35);
        Mahasiswa03 mhs5 = new Mahasiswa03("244160131", "Devi", "A", 3.48);
        Mahasiswa03 mhs6 = new Mahasiswa03("244160205", "Ehsan", "D", 3.61);
        Mahasiswa03 mhs7 = new Mahasiswa03("244160170", "Fizi", "B", 3.06);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nPreorder Traversal Mahasiswa:");
        bta.traversePreOrder(bta.root);
    }
} 
