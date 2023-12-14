package TugasNo4;
import java.util.Scanner;;
public class graphArray<T> {
    private final int vertices;
    private final T[][] arr;

    public graphArray(int v) {
        this.vertices = v;
        this.arr = (T[][]) new Object[this.vertices + 1][this.vertices + 1];
    }

    public void makeEdge(int to, int from, T edge) {
        try {
            arr[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex kosong!");
        }
    }

    public T getEdge(int to, int from) {
        try {
            return arr[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex kosong!");
        }
        return null;
    }

    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray<String> graph;
        try {
            System.out.println("Masukkan Jumlah vertices: ");
            v = sc.nextInt();
            System.out.println("Masukkan Jumlah edges: ");
            e = sc.nextInt();
            graph = new graphArray<>(v);
            while (count <= e) {
                System.out.println("Masukkan edges <to> <from> : ");
                to = sc.nextInt();
                from = sc.nextInt();
                sc.nextLine();
                System.out.println("Masukkan value : ");
                String edge = sc.nextLine();
                graph.makeEdge(to, from, edge);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.println();
            graph.print();
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }

    public void print() {
        System.out.println("\nIsi Graph Array : ");
        int getSize = 56 / (this.arr.length - 1);

        System.out.print("  ");
        for (int i = 1; i <= vertices; i++) {
            System.out.printf("%" + getSize + "s", i);

        }
        System.out.print("\n");
        

        for (int i = 1; i <= (this.arr.length - 1); i++) {
            System.out.print(" " + i + " ");
            for (int j = 1; j <= (this.arr[1].length - 1); j++) {
                T edge = getEdge(i, j);
                System.out.printf("%" + getSize + "s", (edge == null) ? "0 " : edge.toString() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
