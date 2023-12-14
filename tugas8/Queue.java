package tugas8;

public class Queue {
    Pembeli antrian[];
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void peek() {
        if(!IsEmpty()){
            System.out.println("Antrian terdepan: \nNama : " + antrian[front].nama + "\nNomor : " + antrian[front].noHP);
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if(!IsEmpty()){
            System.out.println("Antrian terakhir: \nNama : " + antrian[rear].nama + "\nNomor : " + antrian[rear].noHP);
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print(){
        if (IsEmpty()){
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println("Nama : " + antrian[i].nama + "\nNomor : " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama : " + antrian[i].nama + "\nNomor : " + antrian[i].noHP);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void Enqueue(Pembeli dt) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
            System.exit(0);
        }else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            System.exit(0);
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekPosition (String nm) {
        int posisi = -1;
        for (int j = 0; j < antrian.length; j++){
            if (antrian[j].nama.toLowerCase().contains(nm.toLowerCase())){
                posisi = j;
            }
        }
        if (posisi!=-1) {
            System.out.println("Nama  " + nm + " ditemukan pada antrian ke " + (posisi+1));
            System.out.println("Nama : " + antrian[posisi].nama + "\nNomor : " + antrian[posisi].noHP);
        } else {
            System.out.println("Nama " + nm + " tidak ditemukan");
        }
    }
}
