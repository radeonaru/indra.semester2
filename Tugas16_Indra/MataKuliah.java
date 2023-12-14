package Tugas16_Indra;

public class MataKuliah implements Comparable<MataKuliah>{
    String kode;
    String matkul;
    String sks;

    public MataKuliah(){

    }

    public MataKuliah(String kode, String matkul, String sks) {
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }

    @Override
    public String toString(){
        return String.format("%-15s %-40s %-20s", kode, matkul, sks);
    }

    @Override
    public int compareTo(MataKuliah o) {
        return kode.compareTo(o.kode);
    }

}

