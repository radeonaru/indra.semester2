package Tugas16_Indra;

public class Mahasiswa implements Comparable<Mahasiswa>{
    String nim;
    String nama;
    String notelp;

    

    public Mahasiswa(){

    }

    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return nim.compareTo(o.nim);
    }

     @Override
    public String toString(){
        return String.format("%-15s %-20s %-20s", nim, nama, notelp);
    }

}


