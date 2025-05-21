public class DoubleLinkedList03 {
    Node03 head;
    Node03 tail;
    int size;

    public DoubleLinkedList03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa03 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node03 newNode = new Node03(data);
            Node03 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa03 data) {
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node03 newNode = new Node03(data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }
        Mahasiswa03 dataTerhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa03 dataTerhapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void removeAfter(String keyNim) {
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }
        Mahasiswa03 dataTerhapus = current.next.data;
        if (current.next == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        dataTerhapus.tampil();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        } else if (index == size - 1) {
            removeLast();
            return;
        }
        Node03 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Mahasiswa03 dataTerhapus = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data di indeks " + index + " berhasil dihapus:");
        dataTerhapus.tampil();
    }

    public Node03 search(String nim) {
        Node03 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }
        Node03 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Mahasiswa03 getFirst() {
    if (!isEmpty()) {
        return head.data;
    } else {
        System.out.println("List kosong.");
        return null;
    }
}

public Mahasiswa03 getLast() {
    if (!isEmpty()) {
        return tail.data;
    } else {
        System.out.println("List kosong.");
        return null;
    }
}

public Mahasiswa03 getIndex(int index) {
    if (index < 0 || index >= size) {
        System.out.println("Index di luar batas.");
        return null;
    }
    Node03 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
    return current.data;
}

    public int getSize() {
        return size;
    }
}
