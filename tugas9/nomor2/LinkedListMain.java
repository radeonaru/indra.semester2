package tugas9.nomor2;

public class LinkedListMain {
    public static void main (String [] args) {
        LinkedList nameLL = new LinkedList();

        nameLL.addFirst("Rusdi");
        System.out.println("Menjalankan method addfirst()");
        nameLL.print();

        nameLL.insertAfter("Rusdi", "Dimas");
        System.out.println("Menjalankan method insertAfter()");
        nameLL.print();

        nameLL.insertBefore("Dimas", "Rama");
        System.out.println("Menjalankan method insertBefore()");
        nameLL.print();

        nameLL.addLast("Sigit");
        System.out.println("Menjalankan method addLast()");
        nameLL.print();

        nameLL.insertAt(3, "Rahmat");
        System.out.println("Menjalankan method insertAt()");
        nameLL.print();
    }
}
