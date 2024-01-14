package org.example.Demos;

import org.example.Estruturas.CircularArrayQueue;
import org.example.Exceptions.EmptyCollectionException;

public class DemoCircularArrayQueue {
    public static void main(String[] args) throws EmptyCollectionException {

        CircularArrayQueue<Integer> circularArrayQueue = new CircularArrayQueue<>();

        // Adicionar elementos a queue
        circularArrayQueue.enqueue(10);
        circularArrayQueue.enqueue(20);
        circularArrayQueue.enqueue(30);

        //Print dos elementos da queue
        System.out.println(circularArrayQueue.toString());

        //Testar Metodos
        System.out.println("Elemento na frente da queue: " + circularArrayQueue.first());
        System.out.println("Tamanho da queue: " + circularArrayQueue.size());

        // Remover elementos a queue, tendo em conta que e first IN first OUT vai remover o primeiro elemento.
        System.out.println("Elemento removido: " + circularArrayQueue.dequeue());

        System.out.println("A queue esta vazia? " + circularArrayQueue.isEmpty());

        System.out.println(circularArrayQueue.toString());
    }
}
