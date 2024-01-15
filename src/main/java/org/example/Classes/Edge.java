package org.example.Classes;

public class Edge<T> {
    Vertex<T> vertex1;
    Vertex<T> vertex2;

    public Edge(Vertex<T> vertex1, Vertex<T> vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex<T> getVertex1() {
        return vertex1;
    }

    public void setVertex1(Vertex<T> vertex1) {
        this.vertex1 = vertex1;
    }

    public Vertex<T> getVertex2() {
        return vertex2;
    }

    public void setVertex2(Vertex<T> vertex2) {
        this.vertex2 = vertex2;
    }
}
