package org.example.Demos;

import org.example.Estruturas.LinkedQueue;
import org.example.Exceptions.EmptyCollectionException;

public class DemoLinkedQueue {
    public static void main(String[] args) throws EmptyCollectionException {

        LinkedQueue<Integer> queue = new LinkedQueue<>();

        // Adicionar elementos
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.toString());

        //Testar os metodos da filas
        System.out.println("Elemento na frente da fila: " + queue.first());
        System.out.println("Tamanho da fila: " + queue.size());

        //Remover elemento (no caso da queue vai remover sempre o primeiro elemento)
        System.out.println("Elemento desenfileirado: " + queue.dequeue());

        System.out.println("A fila esta vazia? " + queue.isEmpty());

        System.out.println(queue.toString());

    }
}
