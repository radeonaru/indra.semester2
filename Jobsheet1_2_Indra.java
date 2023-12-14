import java.util.Scanner;
public class Jobsheet1_2_Indra {
public static void main (String [] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("===================================");
    System.out.print("Masukkan Nilai Tugas : ");
    int nilaiTugas = scan.nextInt();
    System.out.print("Masukkan Nilai UTS : ");
    int nilaiUTS = scan.nextInt();
    System.out.print("Masukkan Nilai UAS : ");
    int nilaiUAS = scan.nextInt();

    System.out.println("===================================");

    float nilai = 0;
    nilai += (nilaiTugas *0.2) + (nilaiUTS*0.35) + (nilaiUAS*0.45);
    System.out.println("Nilai akhir : " + nilai);

    if (nilai > 50) {
        if (nilai > 80) {
        System.out.println("Nilai huruf anda : A ");
        }
        else if (nilai > 73) {
        System.out.println("Nilai huruf anda : B+ ");
        }
        else if (nilai > 65) {
        System.out.println("Nilai huruf anda : B ");
        }
        else if (nilai > 60) {
        System.out.println("Nilai huruf anda : C+ ");
        }
        else if (nilai > 50) {
        System.out.println("Nilai huruf anda : C ");
        }
        System.out.println("===================================");
        System.out.println("Selamat, Anda LULUS!");
    }
    else if (nilai <= 50) {     
        if (nilai > 39) {
        System.out.println("Nilai huruf anda : D ");
        }
        else if (nilai <= 39) {
        System.out.println("Nilai huruf anda : E ");
        }
        System.out.println("===================================");
        System.out.println("Anda TIDAK LULUS");
    }
}
}