public class dataMahasiswa {
    String nama, nim, jenisKelamin;
    float ipk;

    dataMahasiswa() {
    }

    dataMahasiswa(String nm, String ni, String jk, float ip) {
        nama = nm;
        nim = ni;
        jenisKelamin = jk;
        ipk = ip;
    }

    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + ipk);
        System.out.println();
    }
}