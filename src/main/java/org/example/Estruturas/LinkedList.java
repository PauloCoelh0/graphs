package org.example.Estruturas;

import org.example.Nodes.Node;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void remove(T element) {
        if (head == null) {
            return;
        }

        if (head.getElement().equals(element)) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getElement().equals(element)) {
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null) {
                    tail = current;
                }
                return;
            }
            current = current.getNext();
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printLinkedList() {
        printLinkedListRecursive(head);
    }

    private void printLinkedListRecursive(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getElement() + " ");
        printLinkedListRecursive(node.getNext());
    }
}
