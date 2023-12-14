public class limasPersegi {
    public double sisiAlas;
    public double tinggi;

    public limasPersegi (double sa, double t) {
        sisiAlas = sa;
        tinggi = t;
    }

    public limasPersegi() {
    }

    public double hitungLuasPermukaan () {
        double sisiMiring = Math.sqrt((sisiAlas/2)*(sisiAlas/2)+ tinggi*tinggi);
        double luasSisiTegak = (sisiAlas*sisiMiring)/2;
        return (sisiAlas*sisiAlas) + (4*luasSisiTegak);
    }

    public double hitungVolume () {
        return sisiAlas * sisiAlas * tinggi * 1/3;
        
    }
}
