import java.util.Scanner;

public class mainDataMahasiswa {
    public static void main (String [] args) {
        String menu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int j = sc.nextInt()+1;
        dataMahasiswa[] dmArray = new dataMahasiswa [j];

        for (int i = 1; i < j; i++){
            dmArray[i] = new dataMahasiswa();
            System.out.println("Masukkan data mahasiswa ke - " + i);
            System.out.print("Masukkan nama : ");
            dmArray[i].nama = sc.next();
            System.out.print("Masukkan NIM : ");
            dmArray[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin : ");
            dmArray[i].jenisKelamin = sc.next();
            System.out.print("Masukkan Nilai IPK : ");
            dmArray[i].ipk = sc.nextFloat();
            System.out.println();
        }
        
        for (int i = 1; i < j; i++){
            System.out.println("Data mahasiswa ke - " + i);
            dmArray[i].tampilData();
        }

        
}
}
