public class Barang {
    String kode, nama;
    float harga;
    int stok;

    public Barang (String kode, String nama, float harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public Barang () {

    }

    void tampilBarang () {
        System.out.println(kode + "\t" + nama + "\t" + harga + "\t" + stok);
    }

    void beli () {
        stok -= 1;
        
    }
    void tampilBeli () {
        System.out.println(kode + "\t" + nama + "\t" + harga);
    }
    
}
