package Jobsheet14_Indra.Percobaan2_1;

import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination, boolean type) {
        if (type == true){
        //add edge directed graph
        list[source].addFirst(destination);
        } else {
        //add back edge undirected graph
        list[destination].addFirst(source);
        }
    }

    public void degree(int source, boolean type) throws Exception {
        
        if (type == true){
        //degree directed graph
            //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            //OutDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
        totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
    } else {
        //degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());
    }
    }

    public void removeEdge(int source, int destination) throws Exception{
        LinkedList sourceLL = list[source];
        LinkedList destinationLL = list[destination];
        for (int i = 0; i < sourceLL.size(); i++) {
            if(sourceLL.get(i)==destination) {
                sourceLL.remove(i);
            }
        }
        for (int i = 0; i < destinationLL.size(); i++) {
            if(destinationLL.get(i)==source) {
                destinationLL.remove(i);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

        public boolean graphType(String type) {
        return type.equalsIgnoreCase("Directed");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Vertex : ");
        int v = sc.nextInt();
        String back, type = null;
        Graph graph = new Graph(v);
        do{
            System.out.println("Masukkan Menu");
            System.out.print("1.AddEdge\n2.PrintGraph\n3.Degree\n4.RemoveEdge\n=>");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1 :
                System.out.print("Masukkan source : ");
                int s = sc.nextInt();
                System.out.print("Masukkan destination : ");
                int d = sc.nextInt();
                System.out.println("Masukkan tipe graf (directed/undirected) : ");
                sc.nextLine();
                type = sc.next();
                graph.addEdge(s, d, graph.graphType(type));
                break;

                case 2 :
                graph.printGraph();
                break;

                case 3 :
                System.out.print("Masukkan degree : ");
                s = sc.nextInt();
                System.out.println("Masukkan tipe graf (directed/undirected) : ");
                sc.nextLine();
                type = sc.next();
                graph.degree(s, graph.graphType(type));
                break;

                case 4 :
                System.out.print("Masukkan source : ");
                s = sc.nextInt();
                System.out.print("Masukkan destination : ");
                d = sc.nextInt();
                graph.removeEdge(s, d);
                break;
            }
            System.out.println("Kembali ke menu? (y/t)");
            back = sc.next();
        }while(back.equalsIgnoreCase("Y"));
        
        //Langkah ke-11
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.addEdge(3, 0);
        // graph.printGraph();
        // graph.degree(2);

        // //Langkah ke-13
        // graph.removeEdge(1, 2);
        // graph.printGraph();
    }
}
