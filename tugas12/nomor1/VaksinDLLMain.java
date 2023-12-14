package tugas12.nomor1;

import java.util.Scanner;

public class VaksinDLLMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists vdll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
        int input = sc.nextInt();

        switch (input) {
            case 1:
            System.out.println("-----------------------------");
            System.out.println("Masukkan Data Penerima Vaksin");
            System.out.println("-----------------------------");
            System.out.println("Nomor Antrian :");
            int nomor = sc.nextInt();
            System.out.println("Nama Penerima :");
            String nama = sc.next();
            vdll.addAntrian(nomor, nama);
            break;

            case 2:
            System.out.println("+++++++++++++++++++++++++++++");
            vdll.removeAntrian();
            System.out.println("+++++++++++++++++++++++++++++");
            break;

            case 3:
            System.out.println("-----------------------------");
            vdll.print();
            System.out.println("-----------------------------");
            break;

            case 4:
            System.out.println("-----------------------------");
            System.out.println("Anda keluar dari program");
            System.out.println("-----------------------------");
            return;

            default :
            System.out.println("Menu yang anda masukkan tidak valid!");
            break;
        }
        System.out.println();
            System.out.print("Kembali ke menu (y/n)? ");
            ulang = sc.next();
        } while (ulang.equalsIgnoreCase("y"));

    }
}
