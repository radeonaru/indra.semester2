import java.util.Scanner;

public class MainSum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Menghitung Keuntungan Total (Satuan Juta, misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan : ");
        int prs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < prs; i++) {
        System.out.printf("Masukkan nama perusahaan ke - %d  : ", (i+1));
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("==========================================");
        for (int j = 0; j < sm.elemen; j++) {
            System.out.print("Masukkan untung bulan ke - " + (j+1) + " = ");
            sm.keuntungan[j] = sc.nextDouble();
            
        }
    
        System.out.println("===========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("===========================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = "+ sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
}
