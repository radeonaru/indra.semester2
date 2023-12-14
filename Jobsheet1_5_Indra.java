import java.util.Scanner;
public class Jobsheet1_5_Indra {

    static int fibonacciIteratif (int n) {
        int a = 1, b = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(c + " ");
        c = a + b;
        a = b;
        b = c;
        }
        return 0;
    }

    static int fibonacciRekursif(int n){
        if (n <= 1){
            return (n);
        } else  {
            return fibonacciRekursif(n-1)+fibonacciRekursif(n-2);
        }
    }
    public static void main (String [] args) {
        fibonacciIteratif(9);
        System.out.println();

        for (int i = 0; i < 9; i++){
            System.out.print(fibonacciRekursif(i) + " ");
        }
    }
}
