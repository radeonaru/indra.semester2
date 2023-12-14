package tugas12.nomor2;

import java.util.Scanner;

public class FilmDLLMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists fdll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        String ulang;
        do {
            System.out.println("=====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=====================================");
            System.out.println("1.Tambah Data Awal");
            System.out.println("2.Tambah Data Akhir");
            System.out.println("3.Tambah Data Index Tertentu");
            System.out.println("4.Hapus Data Pertama");
            System.out.println("5.Hapus Data Terakhir");
            System.out.println("6.Hapus Data Tertentu");
            System.out.println("7.Cetak");
            System.out.println("8.Cari ID Film");
            System.out.println("9.Urut Data Rating Film-DESC");
            System.out.println("10.Keluar");
            System.out.println("====================================");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Masukkan ID : ");
                int id = sc.nextInt();
                System.out.print("Masukkan Judul : ");
                String judul = sc.next();
                sc.nextLine();
                System.out.println("Masukkan Rating : ");
                float rating = sc.nextFloat();
                fdll.addFirst(id, judul, rating);

                break;

                case 2:
                System.out.println("Masukkan ID : ");
                id = sc.nextInt();
                System.out.println("Masukkan Judul : ");
                judul = sc.next();
                sc.nextLine();
                System.out.println("Masukkan Rating : ");
                rating = sc.nextFloat();
                fdll.addLast(id, judul, rating);
                break;

                case 3:
                System.out.println("Masukkan ID : ");
                id = sc.nextInt();
                System.out.print("Masukkan Judul : ");
                judul = sc.next();
                sc.nextLine();
                System.out.println("Masukkan Rating : ");
                rating = sc.nextFloat();
                System.out.println("Data film ini akan masuk di urutan ke-");
                int index = sc.nextInt();
                fdll.add(id, judul, rating, index);
                break;

                case 4:
                fdll.removeFirst();
                break;

                case 5:
                fdll.removeLast();
                break;

                case 6:
                System.out.println("Masukkan index :");
                int idx = sc.nextInt();
                fdll.remove(idx);
                break;

                case 7:
                fdll.print();
                break;

                case 8:
                System.out.println("Masukkan ID : ");
                int idf = sc.nextInt();
                fdll.get(idf);
                break;

                case 9:
                fdll.sortRating();
                System.out.println("Hasil Pengurutan : ");
                fdll.print();
                break;

                case 10:
                System.out.println("Program berakhir!");
                return;

                default :
                System.out.println("Menu yang anda masukkan tidak valid!");
                break;
            }
            System.out.print("Kembali ke menu (y/n)? ");
            ulang = sc.next();
        } while (ulang.equalsIgnoreCase("y"));
        } 
}

