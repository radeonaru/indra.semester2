package tugas12.nomor1;
public class Node {
   int nomor;
   String nama;
   Node prev, next;

   Node (Node prev, int nomor, String nama, Node next) {
    this.prev = prev;
    this.nomor = nomor;
    this.nama = nama;
    this.next = next;
    
   }
}
