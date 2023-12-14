package tugas12.nomor2;

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


    public void addFirst(int id, String judul, float rating) {
        if (isEmpty()){
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, float rating) {
        if (isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (int id, String judul, float rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if(index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
        if (current.prev == null){
            Node newNode = new Node(null, id, judul, rating, current);
            current.prev = newNode;
            head = newNode;
        } else {
            Node newNode = new Node(current.prev, id, judul, rating, current);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
        } size++;
    }

    public void print() {
        if (!isEmpty()){
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID : "+tmp.id + "\nJudul Film : " + tmp.judul + "\nRating : " + tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Daftar Film Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeFirst();
        } else {
            System.out.println("Film " + head.judul + " telah dihapus!");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println("Film " + head.judul + " telah dihapus!");
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Film " + current.next.judul + " telah dihapus!");
        current.next = null;
        size--;
    }

    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            System.out.println("Film " + current.judul + " telah dihapus!");
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("ID Film tidak ditemukan.");
        } 
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            if (index == tmp.id) {
                System.out.println("Data Film :\nIndeks : " + i + "\nID : "+tmp.id + "\nJudul Film : " + tmp.judul + "\nRating : " + tmp.rating);
                break;
            } else {
            tmp = tmp.next;
            }
        }
    }

    public void sortRating(){
        if(isEmpty()|| size==1){
            return;
        } else {
         Node current = head;
         while (current!= null){
                Node nodeNow = current;
                Node nodeNext = current.next;
            while (nodeNext != null) {
                if (nodeNow.judul.compareTo(nodeNext.judul) > 0) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    float tempRating = current.rating;
    
                    current.id = nodeNext.id;
                    current.judul = nodeNext.judul;
                    current.rating = nodeNext.rating;
    
                    nodeNext.id = tempId;
                    nodeNext.judul = tempJudul;
                    nodeNext.rating = tempRating;
                } 
                nodeNext = nodeNext.next;
            } 
            current = current.next;
            }
        }
    }
}
