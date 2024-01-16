package org.example.Estruturas;

import org.example.Classes.Vertex;
import org.example.Interfaces.GraphADT;
import java.util.Iterator;

public class GraphTesteLista<T> implements GraphADT<T> {
    private final ArrayUnorderedList<Vertex<T>> vertices;

    public GraphTesteLista() {
        vertices = new ArrayUnorderedList<>();
    }

    @Override
    public void addVertex(T vertex) {
        vertices.addToRear(new Vertex<>(vertex));
    }

    @Override
    public void removeVertex(T vertex) {
        // Implementação para remover um vértice
    }

    @Override
    public void addEdge(T vertex1, T vertex2) {
        // Implementação para adicionar uma aresta
    }

    @Override
    public void removeEdge(T vertex1, T vertex2) {
        // Implementação para remover uma aresta
    }

    @Override
    public Iterator iteratorBFS(T startVertex) {
        // Implementação do BFS
        return null;
    }

    @Override
    public Iterator iteratorDFS(T startVertex) {
        // Implementação do DFS
        return null;
    }

    @Override
    public Iterator iteratorShortestPath(T startVertex, T targetVertex) {
        // Implementação do caminho mais curto
        return null;
    }

    @Override
    public boolean isEmpty() {
        return vertices.isEmpty();
    }

    @Override
    public boolean isConnected() {
        // Implementação para verificar se o grafo está conectado
        return false;
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public String toString() {
        // Implementação para retornar uma representação em string do grafo
        return "";
    }

    // Métodos auxiliares, como encontrar um vértice, etc.
}
