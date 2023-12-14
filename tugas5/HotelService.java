package tugas5;

public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int idx;

    void tambah(Hotel h){
        if(idx<listHotel.length){
            listHotel[idx] = h;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll(){
        for (Hotel h : listHotel) {
            h.tampil();
            System.out.println("------------------------");
        }
    }

    void bubbleSortHarga(){
        for (int i=0; i<listHotel.length-1; i++){
            for (int j=1; j<listHotel.length-i; j++){
                if (listHotel[j].harga < listHotel[j-1].harga){
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortHarga(){
        for (int i = 0; i< listHotel.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j < listHotel.length; j++){
                if (listHotel[j].harga< listHotel[idxMin].harga){
                    idxMin = j;
                }
            }
            Hotel tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel [i] = tmp;
        }
    }

    void bubbleSortBintang(){
        for (int i=0; i<listHotel.length-1; i++){
            for (int j=1; j<listHotel.length-i; j++){
                if (listHotel[j].bintang > listHotel[j-1].bintang){
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortBintang(){
        for (int i = 0; i< listHotel.length-1; i++){
            int idxMin = i;
            for (int j=i+1; j < listHotel.length; j++){
                if (listHotel[j].bintang > listHotel[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel [i] = tmp;
        }
    }

}
