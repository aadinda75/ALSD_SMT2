package Tugas;

public class QueueLinkedList {
    Node front, rear;
    int size = 0;
    final int MAX = 10; // kapasitas maksimum antrian

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah!");
            return;
        }
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil!");
            return;
        }
        System.out.print("Memanggil: ");
        front.data.tampil();
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            Node temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public void count() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
