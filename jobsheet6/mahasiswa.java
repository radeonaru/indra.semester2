package jobsheet6;

public class mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;


    mahasiswa (int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil () {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("Ipk = " + ipk);
    }
}


