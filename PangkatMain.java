import java.util.Scanner;

public class PangkatMain {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("======================================");
    System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
    int elemen = sc.nextInt();

    Pangkat [] png = new Pangkat[elemen];

    for (int i = 0; i < elemen; i++) {
        
        System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+ " : ");
        int pangkat = sc.nextInt();
        png[i] = new Pangkat(nilai, pangkat);
    }

    System.out.print("Masukkan opsi (1/2) : ");
    int opsi = sc.nextInt();

    switch (opsi) {
        case 1:
    System.out.println("==========================================");
    System.out.println("Hasil Pangkat dengan Brute Force");
    for (int i = 0; i<elemen; i++){
        System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
    }
    break;
        case 2:
    System.out.println("==========================================");
    System.out.println("Hasil Pangkat Dengan Divide and Conquer");
    for (int i = 0; i<elemen; i++){
        System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
    }
    break;
        default:
        System.out.println("Opsi Tidak Valid!");
    }
    }
}
