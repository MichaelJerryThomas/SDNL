package Modul_8;

public class Main {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex("a"); // 0
        theGraph.addVertex("b"); // 1
        theGraph.addVertex("c"); // 2
        theGraph.addVertex("d"); // 3
        theGraph.addVertex("e"); // 4
        theGraph.addVertex("f"); // 5
        theGraph.addVertex("g"); // 6
        theGraph.addVertex("h"); // 7
        theGraph.addVertex("i"); // 8
        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < theGraph.getnVerts(); i++) {
            System.out.println(theGraph.displayVertex(i));
        }
        theGraph.addEdge(0, 8);
        theGraph.addEdge(0, 5);
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(1, 4);
        theGraph.addEdge(2, 4);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(4, 6);
        theGraph.addEdge(5, 6);
        theGraph.addEdge(6, 3);
        theGraph.addEdge(3, 7);
        System.out.println("Matrik adjacency");
        theGraph.tampilMatrik();
        System.out.print("DFS: ");
        theGraph.dfs();
        System.out.println("");
        System.out.print("BFS: ");
        theGraph.bfs();
        System.out.println("");
    }
}

