package praktikum1;

import java.util.Scanner;

public class StackMain {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih, ulang;

        do {
            System.out.print("Jenis : ");
            String jenis = sc.nextLine();
            System.out.print("Warna : ");
            String warna = sc.nextLine();
            System.out.print("Merk : ");
            String merk = sc.nextLine();
            System.out.print("Ukuran : ");
            String ukuran = sc.nextLine();
            System.out.print("Harga : ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda ingin menambah stack (y/n) ? ");
            pilih  = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');

        do {
        System.out.print("Masukkan Menu\n1.IsEmpty\n2.IsFull\n3.Pop\n4.Peek\n5.Print\n6.Clear\n7.Get Min\nPilihan Menu :");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
            stk.IsEmpty();
            break;
            case 2:
            stk.IsFull();
            break;
            case 3:
            stk.pop();
            break;
            case 4:
            stk.peek();
            break;
            case 5:
            stk.print();
            break;
            case 6:
            stk.clear();
            break;
            case 7:
            stk.getMin();
            break;
        }
        
        System.out.print("Ulangi menu (y/n)? ");
        ulang = sc.next().charAt(0);
        } while (ulang == 'y');
    }
}
