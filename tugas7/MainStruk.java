package tugas7;

import java.util.Scanner;

public class MainStruk {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah struk: ");
        int strk = sc.nextInt();
        StackStruk stk = new StackStruk(strk);
        char ulang;

        do {
            System.out.print("Masukkan Menu\n1.Tambah struk\n2.Ambil struk\n3.Tampilkan struk teratas\n4.Tampilkan semua struk\n5.Hapus semua struk\nPilihan menu : ");
            int menu = sc.nextInt();
    
            switch (menu) {
                case 1:
                System.out.print("No Transaksi : ");
                int notrx = sc.nextInt();
                System.out.print("Tanggal Pembelian : ");
                String tanggal = sc.next();
                sc.nextLine();
                System.out.print("Jumlah Barang : ");
                int jumlah = sc.nextInt();
                System.out.print("Total Pembayaran : ");
                int totalbayar = sc.nextInt();
    
                Struk s = new Struk(notrx, tanggal, jumlah, totalbayar);
                stk.push(s);
                break;
                case 2:
                stk.pop();
                break;
                case 3:
                stk.peek();
                break;
                case 4:
                stk.print();
                break;
                case 5:
                stk.clear();
                break;
                default :
                System.out.println("Menu yang anda pilih tidak valid!");
                break;
            }
            
            System.out.print("Ulangi menu (y/n)? ");
            ulang = sc.next().charAt(0);
            } while (ulang == 'y');
    }
}
