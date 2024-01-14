package org.example.Estruturas;

import org.example.Exceptions.EmptyCollectionException;
import org.example.Interfaces.StackADT;

public class ArrayStack<T> implements StackADT<T> {

    private final int DEFAULT_CAPACITY = 100;

    private int top;

    private T[] stack;

    public ArrayStack() {

        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack (int initialCapacity) {

        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    public void push (T element){
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
    }

    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }


    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    private void expandCapacity() {

        T[] newStack = (T[])(new Object[stack.length * 2]);

        for (int i = 0; i<= this.size(); i++){

            newStack[i] = this.stack[i];
        }

        this.stack = newStack;
    }

    public String toString() {

        String result = "Stack [";

        for (int i = 0; i < this.size(); i++){
            result += stack[i];

            if( i < this.size() - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}