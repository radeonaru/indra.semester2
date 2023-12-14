public class FilmMain21 {
    public static void main (String[]args) {
        film film1 = new film();

        film1.judul = "Quantumania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();

        int income = film1.totalRevenue(4);

        System.out.println("Total jual 4 tiket : " + income);

        System.out.println("===========\n");

        film film2 = new film("Maniaquantum", "Horror", "Dewasa", 2000, 40000);
        film2.tampilFilm();

        System.out.println("===========\n");
        
        film film3 = new film("Demon Slayer", "Aksi", "Remaja", 5000, 40000);
        film3.tampilFilm();
    }

}
