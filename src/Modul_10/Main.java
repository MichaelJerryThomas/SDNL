package Modul_10;

public class Main {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex("j1"); // 0
        theGraph.addVertex("j2"); // 1
        theGraph.addVertex("j3"); // 2
        theGraph.addVertex("j4"); // 3
        theGraph.addVertex("j5"); // 4
        theGraph.addVertex("j6"); // 5
        theGraph.addVertex("j7"); // 6
        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < theGraph.getnVerts(); i++) {
            System.out.println(theGraph.displayVertex(i));
        }
        theGraph.addArrowedEdge(0, 1);//
        theGraph.addArrowedEdge(0, 2);//
        theGraph.addArrowedEdge(1, 3);///
        theGraph.addArrowedEdge(1, 4);//
        theGraph.addArrowedEdge(1, 5);//
        theGraph.addArrowedEdge(2, 3);//
        theGraph.addArrowedEdge(3, 4);//
        theGraph.addArrowedEdge(4, 6);

        System.out.println("Matrik adjacency");
        theGraph.tampilMatrik();

        theGraph.topologi();
        System.out.println("");
    }
}


