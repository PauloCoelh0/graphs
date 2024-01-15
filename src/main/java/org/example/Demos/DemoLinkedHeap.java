package org.example.Demos;

import org.example.Estruturas.LinkedHeap;
import org.example.Exceptions.EmptyCollectionException;

public class DemoLinkedHeap {
    public static void main(String[] args) {
        LinkedHeap<Integer> linkedHeap = new LinkedHeap<>();

        // Adding elements to the heap
        linkedHeap
                .addElement(20);
        linkedHeap.addElement(15);
        linkedHeap.addElement(30);
        linkedHeap.addElement(10);
        linkedHeap.addElement(12);
        linkedHeap.addElement(25);
        linkedHeap.addElement(5);

        // Finding the minimum element
        try {
            System.out.println("Minimum element: " + linkedHeap.findMin()); // Should be 5
        } catch (EmptyCollectionException e) {
            System.out.println("The heap is empty.");
        }

        // Removing elements from the heap
        try {
            while (!linkedHeap.isEmpty()) {
                int minElement = linkedHeap.removeMin();
                System.out.println("Removed element: " + minElement);
            }
        } catch (EmptyCollectionException e) {
            System.out.println("The heap is empty.");
        }
    }

}
