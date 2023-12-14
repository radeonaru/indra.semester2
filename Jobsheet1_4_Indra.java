import java.util.Scanner;
public class Jobsheet1_4_Indra {
    public static void main (String [] args) {
        String [] tipeBunga = {"Algonema", "Keladi", "Alocasia", "Mawar"};
        String [] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int [] jumlahStok = {0,0,0,0};
        int hargaAlgonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int [][] nilaiArray ={
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        for (int i=0; i < cabangToko.length; i++) {
        System.out.println("Stok Cabang " + cabangToko[i]);
        System.out.println(tipeBunga[0] + "\t: " + nilaiArray[i][0]);
        System.out.println(tipeBunga[1] + "\t\t: " + nilaiArray[i][1]);
        System.out.println(tipeBunga[2] + "\t: " + nilaiArray[i][2]);
        System.out.println(tipeBunga[3] + "\t\t: " + nilaiArray[i][3]);
        System.out.println();
    }

        System.out.println("Jumlah stok bunga diseluruh cabang");
        for (int i=0; i < cabangToko.length; i++) {
            for (int j=0; j < tipeBunga.length; j++) {
            jumlahStok[i] += nilaiArray [j][i];
            }
        System.out.println(tipeBunga[i] + " : " + jumlahStok [i]);
        }
        System.out.println();

        System.out.println("Jumlah pendapatan RoyalGarden 1");
        System.out.println(tipeBunga[0] + "\t: " + (nilaiArray[0][0]-=1) + " => " + (nilaiArray[0][0]*hargaAlgonema));
        System.out.println(tipeBunga[1] + "\t\t: " + (nilaiArray[0][1]-=2) + " => " + (nilaiArray[0][1]*hargaKeladi));
        System.out.println(tipeBunga[2] + "\t: " + (nilaiArray[0][2]-=0) + " => " + (nilaiArray[0][2]*hargaAlocasia));
        System.out.println(tipeBunga[3] + "\t\t: " + (nilaiArray[0][3]-=5) + " => " + (nilaiArray[0][3]*hargaMawar));
        int totalPendapatan = (nilaiArray[0][0]*hargaAlgonema) + (nilaiArray[0][1]*hargaKeladi) + (nilaiArray[0][2]*hargaAlocasia) + (nilaiArray[0][3]*hargaMawar);
        System.out.println("Total Pendapatan => " + totalPendapatan);

}
}
