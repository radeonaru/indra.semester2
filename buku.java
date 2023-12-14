public class buku {
    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;

    buku() {

    }

    buku(String nm, String pg, String pr, int hs, int jm){
        nama = nm;
        pengarang = pg;
        penerbit = pr;
        hargaSatuan = hs;
        jumlah = jm;
    }
    int hitungHargaTotal(int hargaSatuan, int jumlah){
        int hargaTotal = hargaSatuan*jumlah;
        return hargaTotal;
    }
    int hitungDiskon(int hargaTotal){
        int diskon;
        if (hargaTotal>100000){
            diskon = (hargaTotal*10/100);
        }
        else if (hargaTotal>=50000 && hargaTotal<=100000){
            diskon = (hargaTotal*5/100);
        }
        else {
            diskon = 0;
        }
        return diskon;
    }
    int hitungHargaBayar(int hargaTotal, int diskon){
        return hargaTotal - diskon;
    }

    void notaPembayaran (int hargaTotal, int diskon, int totalBayar) {
        System.out.println("Judul Buku : "+ nama);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Penerbit : "+ penerbit);
        System.out.println("Harga Buku : " + hargaSatuan);
        System.out.println("Jumlah Pembelian : " + jumlah);
        System.out.println("Total Harga : " + hitungHargaTotal(hargaSatuan, jumlah));
        System.out.println("Diskon : "+ hitungDiskon(hargaTotal));
        System.out.println("Total Pembayaran : " + hitungHargaBayar(hargaTotal, diskon));
    }
}
