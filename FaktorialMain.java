import java.util.Scanner;
public class FaktorialMain {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];

        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+ (i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("==========================================");
        long startBF = System.nanoTime();
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long finishBF = System.nanoTime() - startBF;
        System.out.println("==========================================");
        long startDC = System.nanoTime();
        System.out.println("Hasil Faktorial Dengan Divide and Conquer");
        for (int i = 0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        long finishDC = System.nanoTime() - startDC;

        System.out.println("===========================================");
        System.out.println("Penghitungan dengan Brute Force selesai dalam waktu : " + finishBF + "nanosekon");
        System.out.println("Penghitungan dengan Brute Force selesai dalam waktu : " + finishDC + "nanosekon");
    }
}
