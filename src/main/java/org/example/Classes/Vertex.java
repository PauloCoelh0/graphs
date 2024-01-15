package org.example.Classes;

import org.example.Estruturas.ArrayUnorderedList;

public class Vertex<T> {
    T data;
    ArrayUnorderedList<Edge<T>> edges;

    public Vertex(T data) {
        this.data = data;
        edges = new ArrayUnorderedList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayUnorderedList<Edge<T>> getEdges() {
        return edges;
    }

    public void setEdges(ArrayUnorderedList<Edge<T>> edges) {
        this.edges = edges;
    }
}
