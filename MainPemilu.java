import java.util.Scanner;

public class MainPemilu {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah Suara : ");
        int elm = sc.nextInt();
        System.out.println("====================================");
        System.out.println("Pilih calon BEM sesuai dengan nomor dibawah (1/2/3/4) \n1.Haris\n2.Rani\n3.Dian\n4.Bisma");
        Pemilu pm = new Pemilu(elm);
        int suara[] = new int [pm.elemen];
        for (int j = 0; j < pm.elemen; j++) {
            System.out.print("Masukkan suara ke-" + (j+1) + " : ");
            int pilih = sc.nextInt();
            pm.namaPemilu(pilih);
            suara[j] = pilih;
            System.out.println();
        }
        System.out.println("=======================================");
        int majority = pm.mayoritasDC(suara, 0, suara.length - 1);
        if (majority != -1) {
            System.out.println("Mayoritas suara yang dipilih adalah : " + majority);
            pm.namaPemilu(majority);
        } else {
            System.out.println("Tidak ada elemen mayoritas");
        }
    }


}    