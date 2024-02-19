package Modul_10;

public class Vertex {

    public String label;
    private boolean visited;

    public Vertex(String label) {
        this.label = label;
        this.visited = false;
    }

    public String getLabel() {
        return label;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

