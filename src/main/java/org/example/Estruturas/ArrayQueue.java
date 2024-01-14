package org.example.Estruturas;

import org.example.Exceptions.EmptyCollectionException;
import org.example.Interfaces.QueueADT;

public class ArrayQueue<T> implements QueueADT<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
        array = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T element){
        if (size() == array.length){
            expandCapacity();
        }
        rear++;
        array[rear] = element;
        size++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException("A fila esta vazia.");
        }
        T element = array[front];
        array[front] = null;
        front++;
        size--;
        return element;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("A fila esta vazia.");
        }
        return array[front];
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayQueue [");
        int count = 0;
        int index = front;
        while (count < size()) {
            sb.append(array[index]);
            if (count < size() - 1){
                sb.append(", ");
            }
            index++;
            count++;
        }
        sb.append("]");
        return sb.toString();
    }


    public void expandCapacity(){
        @SuppressWarnings("unchecked")
        T[] largerArray = (T[]) new Object[array.length * 2];
        int index = front;
        for (int i = 0; i < size(); i++) {
            largerArray[i] = array[index];
            index++; // Incrementamos o indice 'index' para apontar para o proximo elemento no array original.
        }
        array = largerArray;
        front = 0;
        rear = size() -1;
    }
}