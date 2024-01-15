package org.example.Classes;

public class WeightedEdge<T> extends Edge<T> {
    double weight;

    public WeightedEdge(Vertex<T> vertex1, Vertex<T> vertex2, double weight) {
        super(vertex1, vertex2);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
