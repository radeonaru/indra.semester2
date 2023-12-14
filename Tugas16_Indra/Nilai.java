package Tugas16_Indra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;

public class Nilai implements Comparable<Nilai> {
    String nim;
    String nama;
    String matkul;
    String sks;
    String kode;
    float nilai;

    Nilai(String kode, String nim, String nama, String matkul, String sks, Float nilai) {
        this.kode = kode;
        this.nim = nim;
        this.nama = nama;
        this.matkul = matkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-40s %-10s %-10s", nim, nama, matkul, sks, nilai);
    }

    public Nilai() {
    }

    public static void main(String[] args) {
        List<Mahasiswa> m = new ArrayList<>();
        Mahasiswa m1 = new Mahasiswa("20001", "Thalhah", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20002", "Zubair", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20003", "Abdur-Rahman", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20004", "Sa'ad", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20005", "Sa'id", "021xxx");
        Mahasiswa m6 = new Mahasiswa("20006", "Ubaidah", "021xxx");
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        m.add(m6);

        List<MataKuliah> mk = new ArrayList<>();
        MataKuliah mk1 = new MataKuliah("00001", "Internet of Things", "3");
        MataKuliah mk2 = new MataKuliah("00002", "Algoritma dan Struktur Data", "2");
        MataKuliah mk3 = new MataKuliah("00003", "Algoritma dan Pemrograman", "2");
        MataKuliah mk4 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "3");
        MataKuliah mk5 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", "3");
        mk.add(mk1);
        mk.add(mk2);
        mk.add(mk3);
        mk.add(mk4);
        mk.add(mk5);

        List<Nilai> nilaiList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String back;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER 2");
            System.out.println("*************************************************");
            System.out
                    .println("\n1.Input Nilai\n2.Tampil Nilai\n3.Mencari Nilai Mahasiswa\n4.Urut Data Nilai\n5.Hapus Data Mahasiswa\n6.Keluar");
            System.out.print("*************************************************\nPilih\t:");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    int idxMhs = -1, idxMk = -1;
                    System.out.println("Masukkan data");
                    System.out.println("Kode : ");
                    String kodeNilai = sc.next();

                    System.out.println("Nilai : ");
                    Float dataNilai = sc.nextFloat();

                    System.out.println("DAFTAR MAHASISWA");
                    System.out.println("*********************************************************");
                    System.out.printf("%-15s %-20s %-20s\n", "NIM", "Nama", "Nomor Telepon");
                    m.stream().forEach(ms -> {
                        System.out.println("" + ms.toString());
                    });

                    System.out.println("Pilih mahasiswa by nim : ");
                    String nim = sc.next();

                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("*********************************************************");
                    System.out.printf("%-15s %-40s %-20s\n", "Kode", "Mata Kuliah", "SKS");
                    mk.stream().forEach(mat -> {
                        System.out.println("" + mat.toString());
                    });

                    System.out.println("Pilih matkul by kode : ");
                    String kode = sc.next();

                    for (int i = 0; i < m.size(); i++) {
                        if (nim.equals(m.get(i).nim)) {
                            idxMhs = i;
                        }
                    }
                    for (int i = 0; i < mk.size(); i++) {
                        if (kode.equals(mk.get(i).kode)) {
                            idxMk = i;
                        }
                    }

                    Nilai nilaiMhs = new Nilai(kodeNilai, m.get(idxMhs).nim, m.get(idxMhs).nama, mk.get(idxMk).matkul,
                            mk.get(idxMk).sks,
                            dataNilai);
                    nilaiList.add(nilaiMhs);
                    break;

                case 2:
                    System.out.printf("%-10s %-20s %-40s %-10s %-10s\n", "NIM", "Nama", "Matkul", "SKS", "Nilai");
                    nilaiList.stream().forEach(nli -> {
                        System.out.println("" + nli.toString());
                    });
                    break;

                case 3:
                    int jumSKS = 0;
                    System.out.printf("%-10s %-20s %-40s %-10s %-10s\n", "NIM", "Nama", "Matkul", "SKS", "Nilai");
                    nilaiList.stream().forEach(nli -> {
                        System.out.println("" + nli.toString());
                    });
                    System.out.println("Masukkan nim mahasiswa : ");
                    nim = sc.next();
                    System.out.printf("%-10s %-20s %-40s %-10s %-10s\n", "NIM", "Nama", "Matkul", "SKS", "Nilai");
                    for (int i = 0; i < nilaiList.size(); i++) {
                        if (nim.equals(nilaiList.get(i).nim)) {
                            System.out.println(nilaiList.get(i));
                            jumSKS += Integer.parseInt(nilaiList.get(i).sks);
                        }
                    }
                    System.out.println("Total SKS " + jumSKS + " telah diambil");
                    break;

                case 4:
                    Collections.sort(nilaiList, Collections.reverseOrder());
                    System.out.println("Pengurutan Berhasil!");
                    break;

                case 5:
                    Queue<Nilai> nilaiQueue = new LinkedList<>(nilaiList);
                    Nilai pollNilai = nilaiQueue.poll();
                    System.out.println("Data Mahasiswa yang dihapus :");
                    System.out.printf("%-10s %-20s %-40s %-10s %-10s\n", "NIM", "Nama", "Matkul",
                            "SKS", "Nilai");
                    System.out.println(pollNilai);
                    nilaiList.clear();
                    nilaiList.addAll(nilaiQueue);
                    break;

                case 6:
                    System.out.println("Anda Keluar dari program!");
                    return;

            }
            System.out.println("Kembali ke menu? (y/t)");
            back = sc.next();
        } while (back.equalsIgnoreCase("y"));
    }

    @Override
    public int compareTo(Nilai o) {
        return Float.compare(this.nilai, o.nilai);
    }
}
