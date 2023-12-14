package UTS;

import java.util.Scanner;

public class MainTransaksi {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        rekening listRek[] = new rekening [10];
        transaksi listTrx[] = new transaksi [10];

        listRek[0] = new rekening("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu");
        listRek[1] = new rekening("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org");
        listRek[2] = new rekening("16240401 2243","Fuller","Finn Dunlap","571-7062","convallis@Vestibulumanteipsum.org");
        listRek[3] = new rekening("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca");
        listRek[4] = new rekening("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com");
        listRek[5] = new rekening("16100727 8862","Rudyard","Charles Morales","650-5379","Proin.eget@velitegestaslacinia.ca");
        listRek[6] = new rekening("16460329 4259","Troy","Damon Guerra","897-7608","pede.Suspendisse.dui@a.ca");
        listRek[7] = new rekening("16320421 3437","Alec","Cooper Lee","792-4447","non@mus.com");
        listRek[8] = new rekening("16180729 7229","Walter","Seth Drake","863-8209","Pellentesque.ut.ipsum@neque.ca");
        listRek[9] = new rekening("16080628 2695","Indra","Clarke Roman","1-978-632-5110","Aliquam.gravida@vestibulumMauris.net");
        
        listTrx[0] = new transaksi(774247,739406,775848,"2020-10-24 01:39:00", "Gold");
        listTrx[1] = new transaksi(205420,200162,775880,"2021-06-25 10:23:00", "Platinum");
        listTrx[2] = new transaksi(838632,350929,328316,"2021-09-18 23:00:04","Silver");
        listTrx[3] = new transaksi(230659,204434,690503,"2022-02-02 19:10:34","Platinum");
        listTrx[4] = new transaksi(685302,451002,376442,"2020-05-23 07:34:53","Diamond");
        listTrx[5] = new transaksi(816129,851403,597842,"2021-07-18 19:41:20","Silver");
        listTrx[6] = new transaksi(989609,333823,802752,"2022-02-01 01:13:11","Silver");
        listTrx[7] = new transaksi(297103,396116,779589,"2021-07-03 01:09:49","Gold");
        listTrx[8] = new transaksi(371045,991242,602034,"2021-08-06 11:48:59","Silver");
        listTrx[9] = new transaksi(234301,278309,547922,"2021-08-24 13:18:39","Gold");

        String ulang;
        int menu;
        do {
            System.out.println("==UTS==");
            System.out.print("Masukkan menu :\n1.Tampil data rekening\n2.Tampil data transaksi\n3.Mencari saldo > 500000\n4.Sorting by name\n5.Keluar\nPilihan : ");
            menu = sc.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                System.out.println("Nomor Rekening\t\t Nama\t\t Nama Ibu\t\t Nomor Telepon \t\t Email");
                for (int i = 0; i<listRek.length; i++){
                    System.out.println(listRek[i].noRekening + "\t\t " + listRek[i].nama + "    \t " + listRek[i].namaIbu 
                    + "      \t " + listRek[i].phone + "       \t " + listRek[i].email);
                }
                break;

                case 2:
                System.out.println("Nomor Rekening\t\tSaldo\t\t Saldo Awal\t Saldo Akhir\t Tanggal Transaksi\t Type");
                for (int i = 0; i<listTrx.length; i++){
                    System.out.println(listRek[i].noRekening + "\t\t" + listTrx[i].saldo + "\t " + listTrx[i].saldoAwal + "\t " 
                    + listTrx[i].saldoAkhir + "\t " + listTrx[i].tanggalTransaksi + "\t " + listTrx[i].type);
                }
                break;

                case 3:
                System.out.println("Nomor Rekening\t\tSaldo\t\t Saldo Awal\t Saldo Akhir\t Tanggal Transaksi\t Type");
                for (int i = 0; i<listTrx.length; i++){
                    if (listTrx[i].saldo > 500000){
                    System.out.println(listRek[i].noRekening + "\t\t" + listTrx[i].saldo + "\t " + listTrx[i].saldoAwal + "\t " 
                    + listTrx[i].saldoAkhir + "\t " + listTrx[i].tanggalTransaksi + "\t " + listTrx[i].type);
                    }
                }
                break;

                case 4:
                System.out.println("Nomor Rekening\t\t Nama\t\t Nama Ibu\t\t Nomor Telepon \t\t Email");
                for (int i = 0; i < listRek.length - 1; i++) {
                    for (int j = i + 1; j < listRek.length; j++) {
                      if (listRek[i].nama.compareTo(listRek[j].nama) > 0) {
                        String temp = listRek[i].nama;
                        listRek[i].nama = listRek[j].nama;
                        listRek[j].nama = temp;
                      }
                    }
                }

                for (int i = 0; i<listRek.length; i++){
                    System.out.println(listRek[i].noRekening + "\t\t " + listRek[i].nama + "    \t " + listRek[i].namaIbu 
                    + "      \t " + listRek[i].phone + "       \t " + listRek[i].email);
                }
                break;

                case 5:
                System.out.println("Anda telah keluar dari program!");
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
