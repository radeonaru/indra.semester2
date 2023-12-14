package tugas9.nomor4;

import java.util.Scanner;

public class WarungMain {
    public static void menu (){
        System.out.println("Pilih menu :");
        System.out.println("1.Antrian baru");
        System.out.println("2.Antrian keluar");
        System.out.println("3.Cek antrian terdepan");
        System.out.println("4.Cek semua antrian");
        System.out.println("5.Cek antrian paling belakang");
        System.out.println("6.Cari Pembeli");
        System.out.println("-------------------------");
        System.out.print("Pilihan menu => ");
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        WarungLinkedList WarungLL = new WarungLinkedList();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                System.out.print("Nama Pelanggan : ");
                String nama = sc.next();
                WarungLL.addPelanggan(nama);
                break;

                case 2:
                WarungLL.removeFirst();
                break;

                case 3:
                WarungLL.printHead();
                break;

                case 4:
                WarungLL.print();
                break;

                case 5:
                WarungLL.printTail();
                break;

                case 6:
                System.out.print("Masukkan nama pelanggan : ");
                String cariNama = sc.next();
                if((WarungLL.indexOf(cariNama)+1)==0){
                    System.out.println("Pelanggan tidak ditemukan!!!");
                } else {
                    System.out.println(cariNama + " Berada dalam antrian ke-"+(WarungLL.indexOf(cariNama)+1));
                }
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 
        || pilih == 5 || pilih == 6);
    }
    }
