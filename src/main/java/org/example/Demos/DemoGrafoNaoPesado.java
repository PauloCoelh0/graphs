package org.example.Demos;

import org.example.Estruturas.Graph;
import org.example.Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class DemoGrafoNaoPesado {

    public static void main(String[] args) {
        // Criação do grafo
        Graph<String> graph = new Graph<>();

        // Adição de vértices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Adição de arestas
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        // Verificar se o grafo está vazio
        System.out.println("O grafo está vazio? " + graph.isEmpty());

        // Tamanho do grafo
        System.out.println("Número de vértices no grafo: " + graph.size());

        // Conectividade do grafo
        try {
            System.out.println("O grafo é conectado? " + graph.isConnected());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        // Travessia BFS
        System.out.println("Travessia BFS a partir de A:");
        Iterator<String> bfsIterator = graph.iteratorBFS("A");
        while
        (bfsIterator.hasNext()) {
            System.out.print(bfsIterator.next() + " ");
        }
        System.out.println(); // Adiciona uma nova linha após a travessia

        // Travessia DFS
        System.out.println("Travessia DFS a partir de A:");
        Iterator<String> dfsIterator = graph.iteratorDFS("A");
        while (dfsIterator.hasNext()) {
            System.out.print(dfsIterator.next() + " ");
        }
        System.out.println(); // Adiciona uma nova linha após a travessia

        // Remoção de uma aresta e verificação da conectividade novamente
        graph.removeEdge("D", "E");
        try {
            System.out.println("O grafo é conectado após remover a aresta D-E? " + graph.isConnected());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        // Representação do grafo
        System.out.println("Representação do grafo:");
        System.out.println(graph.toString());
    }
}
