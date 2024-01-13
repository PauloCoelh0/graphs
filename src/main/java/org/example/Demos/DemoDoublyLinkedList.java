package org.example.Demos;

import org.example.Estruturas.DoublyLinkedList;

public class DemoDoublyLinkedList {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList();

        System.out.println("Is the list empty? " + list.isEmpty());

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);

        System.out.println("List after inserting at the head:");
        list.printList();

        list.removeFirst();
        list.removeLast();

        System.out.println("List after removing the first and last elements:");
        list.printList();
    }
}
