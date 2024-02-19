/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasGraph;

/**
 *
 * @author HP
 */
public class Graph {

    private int vertices;
    private int[][] adjacencyMatrix;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int fromVertex, int toVertex) {
        adjacencyMatrix[fromVertex][toVertex] = 1;
        adjacencyMatrix[toVertex][fromVertex] = 1; // For undirected graph
    }

    public void removeEdge(int fromVertex, int toVertex) {
        adjacencyMatrix[fromVertex][toVertex] = 0;
        adjacencyMatrix[toVertex][fromVertex] = 0;
    }

    public boolean isEdge(int fromVertex, int toVertex) {
        return adjacencyMatrix[fromVertex][toVertex] == 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                sb.append(adjacencyMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Adjacency Matrix:");
        System.out.println(graph);

        System.out.println("Is there an edge between vertex 0 and 1? " + graph.isEdge(0, 1));
        System.out.println("Is there an edge between vertex 1 and 4? " + graph.isEdge(1, 4));

        graph.removeEdge(0, 1);
        System.out.println("Adjacency Matrix after removing edge:");
        System.out.println(graph);
    }
}
