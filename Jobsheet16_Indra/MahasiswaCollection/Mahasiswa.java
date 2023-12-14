package Jobsheet16_Indra.MahasiswaCollection;

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
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return nim.compareTo(o.nim);
    }
}
