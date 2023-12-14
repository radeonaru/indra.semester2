package kuis2;

public class DoubleLinkedList21 {
    Pembeli21 headPembeli;
    Pesanan21 headPesanan;
    int sizePembeli;
    int sizePesanan;
    
    public DoubleLinkedList21 () {
        headPembeli = null;
        headPesanan = null;
        sizePembeli = 0;
        sizePesanan = 0;
    }

    public boolean isEmptyPembeli () {
        return headPembeli == null;
    }

    public boolean isEmptyPesanan () {
        return headPesanan == null;
    }

    public int sizePembeli() {
        return sizePembeli;
    }
    public int sizePesanan() {
        return sizePesanan;
    }

    public void clearPembeli() {
        headPembeli = null;
        sizePembeli = 0;
    }

    public void ClearPesanan() {
        headPesanan = null;
        sizePesanan = 0;
    }

    public void addAntrianPembeli(String namaPembeli, String noHP) {
        if (isEmptyPembeli()) {
            headPembeli = new Pembeli21(null, namaPembeli, noHP, null);
        } else {
            Pembeli21 current = headPembeli;
            while (current.next != null) {
                current = current.next;
            }
            Pembeli21 newNode = new Pembeli21(current, namaPembeli, noHP, null);
            current.next = newNode;
            sizePembeli++;
            sizePesanan++;
        }
    }

    public void printPembeli() {
        if (!isEmptyPembeli()){
            Pembeli21 tmp = headPembeli;
            System.out.println("Nama \t|\t No HP");
            while (tmp != null) {
                System.out.println(tmp.namaPembeli + "\t|\t" + tmp.noHp);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
            System.out.println("Total Antrian : " + (sizePembeli+1));
        } else {
            System.out.println("Antrian Kosong");
        }
        
    }

    public void removeAntrianPembeli() throws Exception {
        if (isEmptyPembeli()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus!");
        } else if (sizePembeli == 1) {
            removeAntrianPembeli();
        } else {
            System.out.println(headPembeli.namaPembeli + " telah memesan Menu");
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
            sizePembeli--;
        }
    }

    public void addPesanan(int kodePesanan, String namaPesanan, int harga) {
        if (isEmptyPesanan()) {
            headPesanan = new Pesanan21(null, kodePesanan, namaPesanan, harga, null);
        } else {
            Pesanan21 current = headPesanan;
            while (current.next != null) {
                current = current.next;
            }
            Pesanan21 newNode = new Pesanan21(current, kodePesanan, namaPesanan, harga, null);
            current.next = newNode;
            sizePesanan++;
        }
    }

    public void printPesanan() {
        if (!isEmptyPesanan()){
            Pesanan21 tmp = headPesanan;
            System.out.println("Kode \t|\t Nama Pesanan \t|\t Harga");
            while (tmp != null) {
                System.out.println(tmp.kodePesanan + "\t|\t" + tmp.namaPesanan + "\t|\t" + tmp.harga);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
            System.out.println("Pesanan Berhasil dicetak");
        } else {
            System.out.println("Antrian Kosong");
        }

    }

    public void sortNamaPesanan(){
        if(isEmptyPesanan()|| sizePesanan==1){
            return;
        } else {
         Pesanan21 current = headPesanan;
         while (current!= null){
                Pesanan21 nodeNow = current;
                Pesanan21 nodeNext = current.next;
            while (nodeNext != null) {
                if (nodeNow.namaPesanan.compareTo(nodeNext.namaPesanan) > 0) {
                    int tempKodePesanan = current.kodePesanan;
                    String tempNamaPesanan = current.namaPesanan;
                    int tempHarga = current.harga;
    
                    current.kodePesanan = nodeNext.kodePesanan;
                    current.namaPesanan = nodeNext.namaPesanan;
                    current.harga = nodeNext.harga;
    
                    nodeNext.kodePesanan = tempKodePesanan;
                    nodeNext.namaPesanan = tempNamaPesanan;
                    nodeNext.harga = tempHarga;
                } 
                nodeNext = nodeNext.next;
            } 
            current = current.next;
            }
        }
    }

    public void hitungPendapatan() {
        Pesanan21 tmp = headPesanan;
        int totalPendapatan = 0;
        while (tmp != null) {
            totalPendapatan += tmp.harga;
            tmp = tmp.next;
        }
        System.out.println("Pendapatan Hari ini : " + totalPendapatan);
    }

}
