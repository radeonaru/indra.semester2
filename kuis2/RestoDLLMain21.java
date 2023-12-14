package kuis2;

import java.util.Scanner;

public class RestoDLLMain21 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList21 dll21 = new DoubleLinkedList21(); 
        Scanner indra = new Scanner(System.in);
        String ulang;

        
        dll21.addAntrianPembeli("Safira", "084353672721");
        dll21.addAntrianPembeli("Daffa", "081364534531");
        dll21.addAntrianPembeli("Rusdi", "087376153222");
        dll21.addAntrianPembeli("Rehan", "082623612373");
        dll21.addAntrianPembeli("Yoga", "082826443781");

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("INDRA JAYA RESTO");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Menu :");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6) :");
            int input = indra.nextInt();
    
            switch (input) {
                case 1:
                System.out.println("---------------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("---------------------------");
                System.out.println("Nomor Antrian : " + (dll21.sizePembeli+1));
                System.out.print("Nama Customer : ");
                String nama = indra.nextLine();
                indra.next();
                System.out.print("No HP : ");
                String noHp = indra.nextLine();
                indra.next();
                dll21.addAntrianPembeli(nama, noHp);
                break;
    
                case 2:
                dll21.printPembeli();
                break;
    
                case 3:
                dll21.removeAntrianPembeli();
                System.out.println("---------------------------");
                System.out.println("Transaksi Input Pesanan");
                System.out.println("---------------------------");
                System.out.print("Kode Pesanan : ");
                int kodePesanan = indra.nextInt();
                System.out.print("Nama Pesanan : ");
                String namaPesanan = indra.nextLine();
                indra.next();
                System.out.print("Harga : ");
                int harga = indra.nextInt();
                dll21.addPesanan(kodePesanan, namaPesanan, harga);
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("Daftar Pesanan Masuk Indra Jaya Resto");
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                dll21.printPesanan();
                break;
                
                case 4:
                dll21.sortNamaPesanan();
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("Daftar Pesanan Masuk Indra Jaya Resto");
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                dll21.printPesanan();
                break;

                case 5:
                System.out.println("+++++++++++++++++++++");
                System.out.println("TOTAL PENDAPATAN");
                System.out.println("+++++++++++++++++++++");
                dll21.hitungPendapatan();
                break;

                case 6:
                
                return;
    
                default :
                System.out.println("Menu yang anda masukkan tidak valid!");
                break;
            }
            System.out.println();
                System.out.print("Kembali ke menu (y/n)? ");
                ulang = indra.next();
            } while (ulang.equalsIgnoreCase("y"));

    }
}
