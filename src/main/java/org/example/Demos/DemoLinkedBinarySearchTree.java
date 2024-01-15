package org.example.Demos;

import org.example.Estruturas.LinkedBinarySearchTree;
import org.example.Exceptions.ElementNotFoundException;
import org.example.Exceptions.EmptyCollectionException;

public class DemoLinkedBinarySearchTree {
    public static void main(String[] args) {
        LinkedBinarySearchTree<Integer> bst = new LinkedBinarySearchTree<>();

        // Test adding elements
        bst.addElement(8);
        bst.addElement(3);
        bst.addElement(10);
        bst.addElement(1);
        bst.addElement(6);
        bst.addElement(14);
        bst.addElement(4);
        bst.addElement(7);
        bst.addElement(13);

        // Test finding min and max
        try {
            System.out.println("Minimum: " + bst.findMin());
            System.out.println("Maximum: " + bst.findMax());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        // Test removing elements
        try {
            bst.removeElement(3); // Node with two children
            bst.removeElement(1); // Leaf node
            bst.removeElement(10); // Node with one child
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

        // Test removing min and max
        try {
            System.out.println("Removing Minimum: " + bst.removeMin());
            System.out.println("Removing Maximum: " + bst.removeMax());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        // Test removeAllOccurrences
        bst.addElement(13);
        bst.addElement(13);
        try {
            System.out.println("Removing all occurrences of 13");
            bst.removeAllOccurrences(13);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

        // After removals, find new min and max
        try {
            System.out.println("New Minimum: " + bst.findMin());
            System.out.println("New Maximum: " + bst.findMax());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
}
