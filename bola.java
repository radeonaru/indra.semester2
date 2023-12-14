public class bola {
    public double jariJari;

    public bola (double j) {
        jariJari = j;
    }

    public bola() {
    }

    public double hitungLuasPermukaan () {
        return 4 * 3.14 * jariJari * jariJari;
    }

    public double hitungVolume () {
        return  3.14 * jariJari * jariJari * jariJari * 4/3;
    }
}
