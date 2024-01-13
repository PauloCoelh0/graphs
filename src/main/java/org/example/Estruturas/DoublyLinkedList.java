package org.example.Estruturas;

import org.example.Nodes.DoublyNode;

public class DoublyLinkedList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public void printList() {
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    //    // Método para imprimir os elementos da lista ligada de forma recursiva


//    public void printLinkedList() {
//        printLinkedListRecursive(head);
//    }
//
//    private void printLinkedListRecursive(Node node) {
//        if (node == null) {
//            return;
//        }
//        System.out.print(node.data + " ");
//        printLinkedListRecursive(node.next);
//    }


    // Método para imprimir os elementos da lista do início ao fim
    public void printForward() {
        printForwardRecursive(head);
        System.out.println("");
    }

    private void printForwardRecursive(DoublyNode<T> current) {
        if (current == null) {
            return;
        }
        printForwardRecursive(current.getNext());
        System.out.print(current.getData() + " ");
    }

    // Método para imprimir os elementos da lista do fim ao início
    public void printBackward() {
        printBackwardRecursive(tail);
        System.out.println("");
    }

    private void printBackwardRecursive(DoublyNode<T> current) {
        if (current == null) {
            return;
        }
        printBackwardRecursive(current.getPrev());
        System.out.print(current.getData() + " ");
    }
}