package org.example.Demos;

import org.example.Estruturas.ArrayQueue;
import org.example.Exceptions.EmptyCollectionException;

public class DemoArrayQueue {
    public static void main(String[] args) throws EmptyCollectionException {

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);

        System.out.println(arrayQueue);

        System.out.println("Elemento na frente da queue: " + arrayQueue.first());
        System.out.println("Tamanho da queue: " + arrayQueue.size());

        System.out.println("Elemento removido: " + arrayQueue.dequeue());

        System.out.println("A queue esta vazia? " + arrayQueue.isEmpty());

        System.out.println(arrayQueue);

    }
}
