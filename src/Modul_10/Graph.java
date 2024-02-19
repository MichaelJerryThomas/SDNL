package Modul_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private int maxVerts;
    private int nVerts;
    private Vertex[] vertexList;
    private int[][] adjMatrix;

    public Graph() {
        this.maxVerts = 20;
        this.nVerts = 0;
        vertexList = new Vertex[maxVerts];
        adjMatrix = new int[maxVerts][maxVerts];
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public Graph(int maxVerts) {
        this.maxVerts = maxVerts;
        this.nVerts = 0;
        vertexList = new Vertex[maxVerts];
        adjMatrix = new int[maxVerts][maxVerts];
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void addArrowedEdge(int start, int end) {
        adjMatrix[start][end] = 1;
    }

    public String displayVertex(int v) {
        return vertexList[v].getLabel();
    }

    public void tampilMatrik() {
        System.out.print("  ");
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i] != null) {
                System.out.print(vertexList[i].getLabel() + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].getLabel() + " ");
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getnVerts() {
        return nVerts;
    }

    public void bfs() {
        int kunjungi = 0;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(kunjungi);
        while (!queue.isEmpty()) {
            int bantu = queue.poll();
            if (!vertexList[bantu].isVisited()) {
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].setVisited(true);
            }
            for (int i = 0; i < nVerts; i++) {
                if (adjMatrix[bantu][i] >= 1) {
                    if (!vertexList[i].isVisited()) {
                        queue.add(i);
                    }
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
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].setVisited(true);
            }
            for (int i = nVerts; i >= 0; i--) {
                if (adjMatrix[bantu][i] == 1) {
                    if (!vertexList[i].isVisited()) {
                        stack.push(i);
                    }
                }
            }
        }
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].setVisited(false);
        }
    }

    public void topologi() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[maxVerts];

        for (int i = 0; i < nVerts; i++) {
            if (!visited[i]) {
                topologi(i, visited, stack);
            }
        }

        System.out.println("Topological Sort:");
        while (!stack.isEmpty()) {
            System.out.print(vertexList[stack.pop()].getLabel() + " ");
        }
    }

    private void topologi(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;

        for (int i = 0; i < nVerts; i++) {
            if (adjMatrix[v][i] == 1 && !visited[i]) {
                topologi(i, visited, stack);
            }
        }

        stack.push(v);
    }
}



