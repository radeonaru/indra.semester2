package tugas5;

public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel (String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil(){
        System.out.println("Nama = "+ nama);
        System.out.println("Kota = "+ kota);
        System.out.println("Harga = "+ harga);
        System.out.println("Bintang = "+ bintang);
    }

    
}
