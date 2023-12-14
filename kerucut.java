public class kerucut {
    public double jariJari;
    public double sisiMiring;

    public kerucut (double j, Double s) {
        jariJari = j;
        sisiMiring = s;
    }

    public kerucut() {
    }

    public double hitungLuasPermukaan () {
        return 3.14*jariJari*(jariJari+sisiMiring);
    }

    public double hitungVolume () {
        double tinggi = Math.sqrt(jariJari*jariJari + sisiMiring*sisiMiring);
        return 3.14 * jariJari * jariJari * tinggi * 1/3;
    }

}
