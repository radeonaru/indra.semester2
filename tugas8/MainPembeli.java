package tugas8;

import java.util.Scanner;

public class MainPembeli {
    public static void menu (){
        System.out.println("Pilih menu :");
        System.out.println("1.Antrian baru");
        System.out.println("2.Antrian keluar");
        System.out.println("3.Cek antrian terdepan");
        System.out.println("4.Cek semua antrian");
        System.out.println("5.Cek antrian paling belakang");
        System.out.println("6.Hapus semua antrian");
        System.out.println("7.Cari Pembeli");
        System.out.println("-------------------------");
        System.out.print("Pilihan menu => ");
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                System.out.print("Nama: ");
                String nama = sc.next();
                sc.nextLine();
                System.out.print("Nomor HP: ");
                int noHP = sc.nextInt();
                System.out.println();

                Pembeli pb = new Pembeli(nama, noHP);
                Q.Enqueue(pb);
                break;

                case 2:
                Pembeli dataKeluar = Q.Dequeue();
                if (!"".equals(dataKeluar.nama) && dataKeluar.noHP != 0) {
                    System.out.println("Antrian yang keluar: " + dataKeluar.nama + " " + dataKeluar.noHP);
                    break;
                }

                case 3:
                Q.peek();
                break;

                case 4:
                Q.print();
                break;

                case 5:
                Q.peekRear();
                break;

                case 6:
                Q.clear();
                break;
                
                case 7:
                System.out.print("Masukkan nama pembeli : ");
                String cariNama = sc.next();
                Q.peekPosition(cariNama);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    }
