package Modul_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int nVerts;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjacencyMatrix = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
    }

    public String displayVertex(int vertexIndex) {
        return (vertexList[vertexIndex].label);
    }

    public int getnVerts() {
        return nVerts;
    }

    public void tampilMatrik() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void bfs() {
        int kunjungi = 0;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(kunjungi);
        while (!queue.isEmpty()) {
            int bantu = queue.poll();
            if (!vertexList[bantu].isVisited()) {
                System.out.print(vertexList[bantu].label);
                vertexList[bantu].setVisited(true);
            }
            for (int i = 0; i < nVerts; i++) {
                if (adjacencyMatrix[bantu][i] == 1 && !vertexList[i].isVisited()) {
                    queue.add(i);
                }
            }
        }
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].setVisited(false);
        }
    }

    public void dfs() {
        int kunjungi = 0;
        int bantu;

        Stack<Integer> stack = new Stack<>();
        stack.push(kunjungi);

        while (!stack.isEmpty()) {
            bantu = stack.pop();
            if (!vertexList[bantu].isVisited()) {
                System.out.print(vertexList[bantu].label);
                vertexList[bantu].setVisited(true);
            }
            for (int i = nVerts - 1; i >= 0; i--) {
                if (adjacencyMatrix[bantu][i] == 1 && !vertexList[i].isVisited()) {
                    stack.push(i);
                }
            }
        }
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].setVisited(false);
        }
    }
}

