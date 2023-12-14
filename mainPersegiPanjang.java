import java.util.Scanner;
public class mainPersegiPanjang {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang yang akan dihitung : ");
        int j = sc.nextInt();
        persegiPanjang[] ppArray = new persegiPanjang [j];

        for (int i = 0; i < j; i++){
            ppArray[i] = new persegiPanjang();  
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {

            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " +ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
   
    }
}
