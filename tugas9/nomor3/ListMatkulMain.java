package tugas9.nomor3;

public class ListMatkulMain {
    public static void main (String [] args) {
        LinkedList matkulLL = new LinkedList();

        matkulLL.addFirst("Bahasa");
        matkulLL.insertBefore("Bahasa", "Android");
        matkulLL.insertBefore("Android", "Komputer");
        matkulLL.insertBefore("Komputer", "Basis Data");
        matkulLL.insertBefore("Basis Data", "Matematika");
        matkulLL.insertBefore("Matematika", "Algoritma");
        matkulLL.insertBefore("Algoritma", "Statistika");
        matkulLL.insertBefore("Statistika", "Multimedia");
        matkulLL.print();
    }
}
