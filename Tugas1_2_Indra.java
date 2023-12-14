import java.util.Scanner;
public class Tugas1_2_Indra {
    public static void main (String [] args) {
        int uang = 1000000;
        int counter = 0;

        do {
            uang *= 1.02;
            counter++;
            System.out.println("Bulan ke - " + counter);
            System.out.println("Saldo : Rp " + uang);
            System.out.println();
        }
        while (uang <= 1500000);

        System.out.println("Saldo mencapai Rp 1500000 pada bulan ke - " + counter);
    }
}