import java.util.Scanner;
public class Tugas1_3_Indra {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int n = scan.nextInt();
        int bilangan = 2;
        for (int i=1; i <= n; i++){
            System.out.print(bilangan + " ");
            bilangan += 4;
            if (bilangan%4==0) {
                continue;
            }
        }
    }
}
