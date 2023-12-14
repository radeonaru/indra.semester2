package tugas9.nomor2;

public class LinkedList {
    Node head, tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print (){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t\t");
                tmp = tmp.next;
            }
            System.out.println();
        }else {
            System.out.println("Linked List Kosong!!!");
        }
    }

    public void addFirst (String input){
        Node ndNama = new Node(input, null);
        if (isEmpty()){
            head = ndNama;
            tail = ndNama;
        } else {
            ndNama.next = head;
            head = ndNama;
        }
    }

    public void addLast (String input){
        Node ndNama = new Node(input, null);
        if (isEmpty()) {
            head = ndNama;
            tail = ndNama;
        } else {
            tail.next = ndNama;
            tail = ndNama;
        }
    }

    public void insertAfter (String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.toLowerCase().equals(key.toLowerCase())){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null)
                tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt (int index, String input) {
        if(index < 0){
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public void insertBefore (String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        Node prev = null;
        do {
            if (temp.data.toLowerCase().equals(key.toLowerCase())){
                if (prev == null){
                    ndInput.next = head;
                    head = ndInput;
                } else {
                    ndInput.next = temp;
                    prev.next = ndInput;
                }
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != null);
    }
}
