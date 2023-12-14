public class bukuMain {
    public static void main (String[]args){
        buku buku01 = new buku("Boruto : The Next Generation", "Masashi Kishimoto", "Elexmedia", 25000, 3);
        int hargaTotalbuku01 = buku01.hitungHargaTotal(buku01.hargaSatuan, buku01.jumlah);
        int diskonbuku01 = buku01.hitungDiskon(hargaTotalbuku01);
        int totalBayarbuku01 = buku01.hitungHargaBayar(hargaTotalbuku01, diskonbuku01);
        buku01.notaPembayaran(hargaTotalbuku01, diskonbuku01, totalBayarbuku01);

        System.out.println();
        System.out.println("====================================");
        System.out.println();

        buku buku02 = new buku ();
        buku02.nama = "Cara menjadi bapak-bapak : Bagian pengantar";
        buku02.pengarang ="Agus Polkadot";
        buku02.penerbit ="Setono Betek";
        buku02.hargaSatuan =20000;
        buku02.jumlah = 5;
        int hargaTotalbuku02 = buku02.hitungHargaTotal(buku02.hargaSatuan, buku02.jumlah);
        int diskonbuku02 = buku02.hitungDiskon(hargaTotalbuku02);
        int totalBayarbuku02 = buku02.hitungHargaBayar(hargaTotalbuku02, diskonbuku02);
        buku02.notaPembayaran(hargaTotalbuku02, diskonbuku02, totalBayarbuku02);
    }
}