import java.util.Scanner;
public class Tugas1_1_Indra {
    public static void main (String [] args) {
            String customer [] = {"Ani", "Budi", "Bina", "Cita"};
            int pakaian [] = {4, 15, 6, 11};
            int harga []= {0,0,0,0};

            System.out.println("Jasa Cuci Pakaian 'Smile Laundry'");
            for (int i=0; i < pakaian.length; i++){
                harga[i] += pakaian[i]*4500;
                if (pakaian[i] > 10){
                    harga[i] *= 0.9;
                } 

                System.out.println("Nama Customer : " + customer[i]);
                System.out.println("Berat Pakaian : " + pakaian[i]);
                System.out.println("Total Bayar : " + harga[i]);
                System.out.println();
            }
    }
}
