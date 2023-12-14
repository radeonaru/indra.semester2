package tugas12.nomor1;

public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists () {
        head = null;
        size = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addAntrian(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void print() {
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Nomor \t|\t Nama");
            while (tmp != null) {
                System.out.println(tmp.nomor + "\t|\t" + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
        System.out.println("Antrian Tersisa : " + (size+1));
    }

    public void removeAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeAntrian();
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi!");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

}
