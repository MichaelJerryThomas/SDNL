package Modul_11;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4
        graph.addVertex("F"); // 5

        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < graph.getnVerts(); i++) {
            System.out.print(graph.displayVertex(i) + " ");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Jarak dari A ke B adalah 50");
        graph.addEdge(0, 1, 50);
        System.out.println("Jarak dari A ke C adalah 30");
        graph.addEdge(0, 2, 30);
        System.out.println("Jarak dari A ke D adalah 100");
        graph.addEdge(0, 3, 100);
        System.out.println("Jarak dari A ke F adalah 10");
        graph.addEdge(0, 5, 10);
        System.out.println("Jarak dari B ke C adalah 5");
        graph.addEdge(1, 2, 5);
        System.out.println("Jarak dari C ke B adalah 5");
        graph.addEdge(2, 1, 5);
        System.out.println("Jarak dari D ke B adalah 20");
        graph.addEdge(3, 1, 20);
        System.out.println("Jarak dari D ke C adalah 50");
        graph.addEdge(3, 2, 50);
        System.out.println("Jarak dari E ke C adalah 15");
        graph.addEdge(4, 3, 15);
        System.out.println("Jarak dari E ke F adalah 15");
        graph.addEdge(4, 5, 15);
        System.out.println("Jarak dari F ke D adalah 10");
        graph.addEdge(5, 3, 10);

        System.out.println("");

        graph.shortestPath(0);
    }
}


