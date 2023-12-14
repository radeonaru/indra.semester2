import java.util.Scanner;

public class MainBarang {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int menu;
        Barang[] brArray = new Barang [5];
    
        brArray[0] = new Barang("K01", "Rinso", 6000, 12);
        brArray[1] = new Barang("K02", "Biore", 4000, 20);
        brArray[2] = new Barang("K03", "Energen", 2000, 34);
        brArray[3] = new Barang("K04", "Rejoice", 15000, 14);
        brArray[4] = new Barang("K05", "Pepsodent", 10000,7);

        pembelian pbArray[] = new pembelian [5];
        String z;
        do {
        System.out.println("================================");
        System.out.println("TOKO MADURA SUMBER MAKMUR");
        System.out.println("================================");
        System.out.print("Masukkan Menu : \n 1. Tampilkan Barang \n 2. Beli \n 3. Tampilkan Pembelian \n 4. Keluar\nPilih [1-4] : ");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
            System.out.println("Daftar Barang");
            System.out.println("Kode\tNama\tHarga\tStok");
            for (int i=0; i<5; i++) {
            brArray[i].tampilBarang();
            }      
            break;

            case 2:
                String pilih;
                do {
            
            for (int i = 0; i < 5; i++){
                pbArray [i] = new pembelian();
            }
            
            System.out.println("Masukkan kode barang : ");
            String kode = sc.next();
              
            if (kode.equalsIgnoreCase("K01")){
                brArray[0].beli();
                pbArray[1].barang += 1;
                
            } 
            else if (kode.equalsIgnoreCase("K02")){
                brArray[1].beli();
                pbArray[1].barang += 1;
            } 
            else if (kode.equalsIgnoreCase("K03")){
                brArray[2].beli();
                pbArray[2].barang += 1;
            } 
            else if (kode.equalsIgnoreCase("K04")){
                brArray[3].beli();
                pbArray[3].barang += 1;
            } 
            else if (kode.equalsIgnoreCase("K05")){
                brArray[4].beli();
                pbArray[4].barang += 1;

            } 
            else {System.out.println("Kode barang yang anda masukkan tidak ada");}
            
            System.out.println("ketik Y untuk menambah barang ");
            pilih = sc.next();

        } while (pilih.equalsIgnoreCase("Y"));

            case 3:
            for (int j = 0; j < 5; j++){
            for (int i = 0; i < pbArray[0].barang; i++ ) {
                brArray[j].tampilBeli();
            }
            } 
            break;

            case 4:

            return;

            default:
            System.out.println("Menu yang anda masukkan tidak valid");
                break;
        }
        System.out.println("Ketik y jika ingin mengulang program");
        z = sc.next();
    } while (z.equalsIgnoreCase("Y")); 
    }
}

