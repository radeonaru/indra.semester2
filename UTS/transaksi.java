package UTS;

public class transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;

    transaksi (double sl, double saw, double sak, String tt, String ty){
        saldo = sl;
        saldoAwal = saw;
        saldoAkhir = sak;
        tanggalTransaksi = tt;
        type = ty;
    }
}
