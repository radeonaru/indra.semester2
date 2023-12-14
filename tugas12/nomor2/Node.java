package tugas12.nomor2;
public class Node {
   int id;
   String judul;
   float rating;
   Node prev, next;

   Node (Node prev, int id, String judul, float rating, Node next) {
    this.prev = prev;
    this.id = id;
    this.judul = judul;
    this.rating = rating;
    this.next = next;
   }
}
