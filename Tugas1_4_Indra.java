import java.util.Scanner;
public class Tugas1_4_Indra {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" menu :\nA. Menghitung luas segitiga \nB. Menghitung luas persegi panjang \nC. Menghitung luas lingkaran\n Pilihan Opsi => ");
        String menu = scan.next();

        if (menu.equalsIgnoreCase("A")){
            System.out.print("Masukkan nilai alas : ");
            int a = scan.nextInt();
            System.out.print("Masukkan nilai tinggi : ");
            int t = scan.nextInt();

            int nilai = (a*t)/2;
            System.out.println("Luas Segitiga : " + nilai);
        }

        if (menu.equalsIgnoreCase("B")){
            System.out.print("Masukkan nilai panjang : ");
            int p = scan.nextInt();
            System.out.print("Masukkan nilai lebar : ");
            int l = scan.nextInt();

            int nilai = p*l;
            System.out.println("Luas Persegi Panjang : " + nilai);
        }

        if (menu.equalsIgnoreCase("C")){
            System.out.print("Masukkan nilai jari-jari : ");
            int j = scan.nextInt();
        
            Float nilai = 3.14F * j* j;
            System.out.println("Luas Segitiga : " + nilai);
        }
    }
}
