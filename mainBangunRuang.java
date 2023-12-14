import java.util.Scanner;
import java.text.DecimalFormat;

public class mainBangunRuang {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kerucut yang akan dihitung : ");
        int j = sc.nextInt();
        kerucut[] krArray = new kerucut [j];

        for (int i = 0; i < j; i++){
            krArray[i] = new kerucut();  
            System.out.println("Kerucut ke-" + i);
            System.out.print("Masukkan jari-jari: ");
            krArray[i].jariJari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            krArray[i].sisiMiring = sc.nextInt();
        }
        for (int i = 0; i < j; i++) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Luas permukaan kerucut ke " + i + ": " + df.format(krArray[i].hitungLuasPermukaan()));
            System.out.println("Volume kerucut ke " + i + ": " + df.format(krArray[i].hitungVolume()));
        }

        System.out.println("=================================================");

        System.out.print("Masukkan jumlah limas persegi yang akan dihitung : ");
        int l = sc.nextInt();
        limasPersegi[] lmArray = new limasPersegi [j];

        for (int i = 0; i < l; i++){
            lmArray[i] = new limasPersegi();  
            System.out.println("Limas persegi ke-" + i);
            System.out.print("Masukkan sisi alas: ");
            lmArray[i].sisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            lmArray[i].tinggi = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Luas permukaan limas persegi ke " + i + ": " + df.format(lmArray[i].hitungLuasPermukaan()));
            System.out.println("Volume limas persegi ke " + i + ": " + df.format(lmArray[i].hitungVolume()));
        }

        System.out.println("=================================================");

        System.out.print("Masukkan jumlah bola yang akan dihitung : ");
        int b = sc.nextInt();
        bola[] boArray = new bola [j];

        for (int i = 0; i < b; i++){
            boArray[i] = new bola();  
            System.out.println("Bola ke-" + i);
            System.out.print("Masukkan jari-jari : ");
            boArray[i].jariJari = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Luas permukaan limas persegi ke " + i + ": " + df.format(boArray[i].hitungLuasPermukaan()));
            System.out.println("Volume limas persegi ke " + i + ": " + df.format(boArray[i].hitungVolume()));
        }
    }
}
