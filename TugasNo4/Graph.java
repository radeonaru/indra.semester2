package TugasNo4;
import java.util.Scanner;

public class Graph<T> {
    int vertex;
    LinkedList<T> list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public int checkIdx(T source) throws Exception {
        String src = String.valueOf(source);
        int idx = -1;
        for (int i = 0; i < vertex; i++) {
            if (list[i].data == null) {
                list[i].data = src;
                idx = i;
                break;
            } else if (list[i].data.equalsIgnoreCase(src)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public void addEdge(T source, T destination, boolean type) throws Exception {
        // add edge (directed)
        list[checkIdx(source)].addFirst(source, destination);
        // add back (undirected)
        if (type == false) {
            list[checkIdx(destination)].addFirst(destination, source);
        }
    }

    public void degree(T source, boolean type) throws Exception {
        if (type == true) {
            // directed
            // InDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j).equals(list[checkIdx(source)].data));
                    ++totalIn;
                }
                //OutDegree
                for (k = 0; k < list[checkIdx(source)].size(); k++) {
                    list[checkIdx(source)].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree vertex " + source + " : " + totalIn);
            System.out.println("Outdegree vertex " + source + " : " + totalOut);
            System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
        } else {
            // undirected
            System.out.println("degree vertex " + source + " : " + list[checkIdx(source)].size());
        }
    }

    public void removeEdge(T source, T destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == checkIdx(destination)) {
                list[checkIdx(source)].remove(checkIdx(source));
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan!");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + list[i].data + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(String type) {
        return type.equalsIgnoreCase("directed");
    }

    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Vertex : ");
        int v = sc.nextInt();
        String back, s, type = null, d = null;
        Graph<String> graph = new Graph(v);
        do{
            System.out.println("Masukkan Menu");
            System.out.print("1.AddEdge\n2.PrintGraph\n3.Degree\n4.RemoveEdge\n=>");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1 :
                System.out.println("========================");
                System.out.print("Masukkan Source: ");
                sc.nextLine();
                s = sc.next();
                System.out.print("Masukkan destination: ");
                sc.nextLine();
                d = sc.next();
                System.out.print("Masukkan type(directed, undirected) : ");
                sc.nextLine();
                type = sc.next();
                graph.addEdge(s, d, graph.graphType(type));
                break;

                case 2 :
                graph.printGraph();
                break;

                case 3 :
                System.out.print("Masukkan degree : ");
                sc.nextLine();
                s = sc.next();
                System.out.println("Masukkan tipe graf (directed/undirected) : ");
                sc.nextLine();
                type = sc.next();
                graph.degree(s, graph.graphType(type));
                break;

                case 4 :
                System.out.print("Masukkan source : ");
                sc.nextLine();
                s = sc.next();
                System.out.print("Masukkan destination : ");
                sc.nextLine();
                d = sc.next();
                graph.removeEdge(s, d);
                break;

                default :
                System.out.println("Input yang anda masukkan tidak valid!");
            }
            System.out.println("Kembali ke menu? (y/t)");
            back = sc.next();
        }while(back.equalsIgnoreCase("Y"));
        
}
}
