package org.example.Demos;

import org.example.Estruturas.ArrayStack;
import org.example.Exceptions.EmptyCollectionException;

public class DemoArrayStack {
    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        //Testar o Stack

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Tamanho do stack: " + stack.size());

        try {
            System.out.println("Top do stack: " + stack.peek());
        } catch (EmptyCollectionException e) {
            System.out.println("O stack esta vazio.");
        }

//        while (!stack.isEmpty()) {
//            try {
//                System.out.println("Removido: " + stack.pop());
//            } catch (EmptyCollectionException e) {
//                System.out.println("O stack esta vazio.");
//            }
//        }

        try {
            System.out.println("Removido: " + stack.pop());
        } catch (EmptyCollectionException e) {
            System.out.println("O stack esta vazio.");
        }

        System.out.println("Tamanho do Stack: " + stack.size());

        System.out.println("Stack: " + stack.toString());
    }

}
