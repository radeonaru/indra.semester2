package tugas9.nomor4;

public class WarungLinkedList {
    Node head, tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print (){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Antrian warung :\t");
            while (tmp != null){
                System.out.print("\t==>\t" + tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else {
            System.out.println("Antrian masih Kosong!!!");
        }
    }

    public int indexOf (String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.toLowerCase().equals(key.toLowerCase())){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void addPelanggan (String input){
        Node ndNama = new Node(input, null);
        if (isEmpty()){
            head = ndNama;
            tail = ndNama;
        } else {
            ndNama.next = head;
            head = ndNama;
        }
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong!");
        } else if (head == tail){
            System.out.println("Antrian keluar :\n" + head.data);
            head = tail = null;
        } else {
            System.out.println("Antrian keluar :\n" + head.data);
            head = head.next;
        }
    }

    public void printHead(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Pelanggan terdepan : " + tmp.data);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void printTail(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            System.out.println("Pelanggan paling belakang : " + tmp.data);
        }
    }
}
