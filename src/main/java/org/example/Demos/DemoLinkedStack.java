package org.example.Demos;

import org.example.Estruturas.LinkedStack;
import org.example.Exceptions.EmptyCollectionException;

public class DemoLinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        // Verifica se a stack está vazia
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Adiciona elementos à stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Imprime o stack usando toString
        System.out.println("Stack: " + stack);

        // Consulta o tamanho do stack usando size
        System.out.println("Stack size: " + stack.size());

        // Consulta o elemento no topo da stack sem removê-lo
        try {
            System.out.println("Top element: " + stack.peek());
        } catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

        // Remove elementos da stack
        try {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());

        } catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

        // Verifica se a stack está vazia novamente
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
