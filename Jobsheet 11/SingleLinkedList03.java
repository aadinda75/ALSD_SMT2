public class SingleLinkedList03 {
    NodeMahasiswa03 head;
    NodeMahasiswa03 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void addLast(Mahasiswa03 data) {
        NodeMahasiswa03 newNode = new NodeMahasiswa03(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }
        NodeMahasiswa03 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                System.out.println("Index melebihi jumlah data!");
                return;
            }
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa03 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa03 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        NodeMahasiswa03 temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index melebihi jumlah data!");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Index melebihi jumlah data!");
        } else {
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
        } else {
            NodeMahasiswa03 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        }
    }
}