package tugas7;

public class StackStruk {
    int size;
    int top;
    int min;
    Struk data[];

    public StackStruk (int size){
        this.size = size;
        data = new Struk[size];
        top =-1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (Struk pkn) {
        if (!IsFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop () {
        if (!IsEmpty()) {
            Struk x = data[top];
            top--;
            System.out.println("Struk yang diambil : \nNomor transaksi : " + x.notrx + "\nTanggal Pembelian : "
             + x.tanggal + "\nJumlah Barang :  " + x.jumlah + "\nTotal Bayar : " + x.totalbayar);
        } else {
            System.out.println("Stack masih kosong!");
        }
    }

    public void peek() {
        System.out.println("Struk teratas : " + data[top].notrx + " " + data[top].tanggal +
        " " + data[top].jumlah + " " + data[top].totalbayar);
    }

    public void print() {
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].notrx + "\t " + data[i].tanggal +
            "\t " + data[i].jumlah + "\t " + data[i].totalbayar);
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Data sudah dikosongkan!");
        } else {
            System.out.println("Stack masih kosong!");
        }
    }
}
