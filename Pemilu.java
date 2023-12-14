public class Pemilu {
    public int elemen;
    public int suara[];

    Pemilu (int elemen) {
        this.elemen = elemen;
        this.suara = new int [elemen];
    }

    public static int hitungSuara (int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    public static int mayoritasDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lMajor = mayoritasDC(arr, l, mid);
        int rMajor = mayoritasDC(arr, mid + 1, r);
    
        int lCount = hitungSuara(arr, lMajor);
        int rCount = hitungSuara(arr, rMajor);
    
        if (lCount > (r - l + 1) / 2) {
            return lMajor;
        } else if (rCount > (r - l + 1) / 2) {
            return rMajor;
        } else {
            return -1;
        }
    }

    public void namaPemilu (int a) {
        switch (a) {
            case 1:
            System.out.println("Calon yang dipilih : Haris");
            break;

            case 2:
            System.out.println("Calon yang dipilih : Dian");
            break;

            case 3:
            System.out.println("Calon yang dipilih : Rani");
            break;

            case 4:
            System.out.println("Calon yang dipilih : Bisma");
            break;

            default :
            System.out.println("Nomor calon yang dipilih tidak valid!");
            break;
        }
    }
    

}
