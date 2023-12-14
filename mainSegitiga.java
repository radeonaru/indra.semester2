public class mainSegitiga {
    public static void main (String[]args) {
        segitiga[] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10,4);
        sgArray[1] = new segitiga(20,10);
        sgArray[2] = new segitiga(15,6);
        sgArray[3] = new segitiga(25,10);

        for (int i=0; i<4; i++){
            System.out.println("Luas balok ke " + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling balok ke " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
