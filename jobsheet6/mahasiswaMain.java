package jobsheet6;
import java.util.Scanner;

public class mahasiswaMain {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner sl = new Scanner(System.in);

        pencarianMhs data = new pencarianMhs();

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Masukkan data secara urut dari nim terkecil :");
        for (int i = 0; i < jumMhs; i++){
            System.out.println("-------------------------");
            System.out.print("Nim\t:");
            int nim = s.nextInt();
            System.out.print("Nama\t:");
            String nama = sl.nextLine();
            System.out.print("Umur\t:");
            int umur = s.nextInt();
            System.out.print("IPK\t:");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        
            System.out.println("-----------------------------------");
            System.out.println("Data keseluruhan mahasiswa : ");
            data.tampil();
            System.out.println("-----------------------------------");
            String ulang;
        do {
            System.out.println("____________________________________");
            System.out.print("Masukkan opsi :\n1.Mencari NIM Mahasiswa\n2.Mencari Nama Mahasiswa\n Pilihan Opsi => ");
            int opsi = s.nextInt();

            switch (opsi){
                case 1:
            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan nim mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();

            System.out.println("====================================");
            System.out.println("Mencari NIM menggunakan binary search dengan disorting terlebih dahulu");
            data.mergeSort();
            int posisi = data.FindBinarySearch(cari, 0, jumMhs -1);
            data.Tampilposisi(cari, posisi);
            data.tampilData(cari, posisi);
            break;

            case 2:
            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan nama mahasiswa yang dicari : ");
            System.out.print("Nama : ");
            String cariNama = sl.nextLine();
            System.out.println("Mencari nama menggunakan sequential search");
            int posisiNama = data.FindReqSearch(cariNama);
            data.TampilPosisiNama(cariNama, posisiNama);
            data.TampilDataNama(cariNama, posisiNama);
            break;

            default :
            System.out.println("Opsi yang anda masukkan tidak valid!");
            break;
            }

            System.out.print("Kembali ke opsi? (y/n) : ");
            ulang = sl.nextLine();
        } while (ulang.equalsIgnoreCase("y"));        
    }
}
