package tugas5;

import java.util.Scanner;

public class MainHotel {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Anugerah Wisata Hotel", "Yogyakarta", 275000, (byte) 3);
        Hotel h2 = new Hotel("Hotel The Sun", "Surabaya", 469000, (byte) 3);
        Hotel h3 = new Hotel("Mercure Surabaya", "Surabaya", 544500, (byte) 4);
        Hotel h4 = new Hotel("Hotel Majapahit", "Surabaya", 1089000, (byte) 5);
        Hotel h5 = new Hotel("Hotel Garden Palace", "Surabaya", 334000, (byte) 4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println ("Data hotel sebelum disortir : ");
        list.tampilAll();

        System.out.println();
        System.out.print("Pilih methode penyortiran : \n1. Bubble Sort \n2. Selection Sort \nPilihan => ");
        int sort = sc.nextInt();
        switch (sort){
            case 1 :
            System.out.print("Pilih data yang disortir : \n1. Berdasarkan Harga\n2. Berdasarkan Bintang\nPilihan => ");
            int dataB = sc.nextInt();
            System.out.println();
            switch (dataB) {
                case 1 :
                System.out.println("Data hotel setelah sorting ascending berdasarkan harga : ");
                list.bubbleSortHarga();
                list.tampilAll();
                break;

                case 2 :
                System.out.println("Data hotel setelah sorting descending berdasarkan rating bintang : ");
                list.bubbleSortBintang();
                list.tampilAll();
                break;

                default : 
                System.out.println("Pilihan yang anda masukkan tidak valid!");
                break;
            }
            break;

            case 2:
            System.out.print("Pilih data yang disortir : \n1. Berdasarkan Harga\n2. Berdasarkan Bintang\nPilihan => ");
            int dataS = sc.nextInt();
            System.out.println();
            switch (dataS) {
                case 1 :
                System.out.println("Data hotel setelah sorting ascending berdasarkan harga : ");
                list.selectionSortHarga();
                list.tampilAll();
                break;

                case 2 :
                System.out.println("Data hotel setelah sorting descending berdasarkan rating bintang : ");
                list.selectionSortBintang();
                list.tampilAll();
                break;

                default : 
                System.out.println("Pilihan yang anda masukkan tidak valid!");
                break;
            }
            break;

            default :
            System.out.println("Pilihan yang anda masukkan tidak valid!");
            break;
    }
}
}
