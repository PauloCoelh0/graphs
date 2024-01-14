package org.example.Demos;

import org.example.Estruturas.LinkedList;
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Printing the linked list using printList method
        System.out.println("Linked List:");
        linkedList.printList();

        // Removing an element from the linked list
        linkedList.remove(2);

        // Printing the modified linked list
        System.out.println("\nLinked List after removing 2:");
        linkedList.printList();

        // Adding more elements
        linkedList.add(5);
        linkedList.add(6);

        // Printing the linked list recursively
        System.out.println("\nLinked List (Recursively):");
        linkedList.printLinkedList();
    }
}