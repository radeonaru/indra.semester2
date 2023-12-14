package jobsheet6;

public class pencarianMhs {
    mahasiswa listMhs [] = new mahasiswa[5];
    int idx;

    void tambah (mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil () {
        for (mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("-----------------------------");
        }
    }

    public int FindReqSearch (String cari){
        int posisi = -1;
        int duplikat = 0;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].nama.toLowerCase().contains(cari.toLowerCase())){
                posisi = j;
                duplikat++;
            }
        }
        if (duplikat>1){
            System.out.println("!!! Mahasiswa dengan nama " + cari + " Ditemukan lebih dari satu data!");
            System.out.println("Note : Data dengan posisi index terbawah akan ditampilkan");
        }
        return posisi;
    }

    public int FindBinarySearch (int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi (int x, int pos) {
        if (pos!=-1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData (int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("Ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilPosisiNama (String x, int pos) {
        if (pos!=-1) {
            System.out.println("Nama : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Nama " + x + " tidak ditemukan");
        }
    }

    public void TampilDataNama (String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("Ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void mergeSort() {
        sort(0, listMhs.length-1);
    }

    private void merge (int left, int middle, int right) {
        mahasiswa[] temp = new mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a].nim <= temp[b].nim){
                listMhs[c] = temp[a];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i=0; i <= s; i++){
            listMhs [c+i] = temp [a+i];
        }
    }

    private void sort(int left, int right) {
        if (left < right){
            int middle = (left + right)/2;
            sort(left, middle);
            sort(middle+1, right);
            merge(left, middle, right);
        }
    } 
}
