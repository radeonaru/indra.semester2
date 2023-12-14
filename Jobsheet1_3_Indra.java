import java.util.Scanner;
public class Jobsheet1_3_Indra {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long nim = scan.nextLong();
        long n = nim%100;
        System.out.println("===========================");

        if (n < 10){
            n += 10;
        }
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++){
            if (i%7==1) {
                System.out.print("senin ");
            }
            else if (i%7==2) {
                System.out.print("selasa ");
            }
            else if (i%7==3) {
                System.out.print("rabu ");
            }
            else if (i%7==4) {
                System.out.print("kamis ");
            }
            else if (i%7==5) {
                System.out.print("jum'at ");
            }
            else if (i%7==6) {
                System.out.print("sabtu ");
            }
            else if (i%7==0) {
                System.out.print("minggu ");
            }
        } 
    }
}
