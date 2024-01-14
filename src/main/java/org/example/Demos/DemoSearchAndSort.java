package org.example.Demos;

import org.example.Classes.Contact;
import org.example.Classes.SortingAndSearching;

public class DemoSearchAndSort {
    public static void main(String[] args) {
        // Create an array of Contact objects
        Contact[] contacts = {
                new Contact("John", "Doe", "123-456-7890"),
                new Contact("Jane", "Smith", "987-654-3210"),
                new Contact("Alice", "Johnson", "555-123-4567"),
                new Contact("Bob", "Brown", "999-888-7777"),
                new Contact("Eve", "Wilson", "777-888-9999")
        };

        // Testing linear search
        boolean linearFound = SortingAndSearching.linearSearch(contacts, 0, contacts.length - 1, new Contact("Alice", "Johnson", "555-123-4567"));
        System.out.println("Linear Search Result: " + (linearFound ? "Found" : "Not Found"));

        // Testing binary search (requires sorted array)
        SortingAndSearching.selectionSort(contacts); // Sort the array before binary search
        boolean binaryFound = SortingAndSearching.binarySearch(contacts, 0, contacts.length - 1, new Contact("Bob", "Brown", "999-888-7777"));
        System.out.println("Binary Search Result: " + (binaryFound ? "Found" : "Not Found"));

        // Testing selection sort (restore original array order)
        SortingAndSearching.selectionSort(contacts); // Restore the original array order
        System.out.println("Selection Sort Result:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

        // Testing insertion sort (restore original array order)
        SortingAndSearching.insertionSort(contacts); // Restore the original array order
        System.out.println("Insertion Sort Result:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

        // Testing bubble sort (restore original array order)
        SortingAndSearching.bubbleSort(contacts); // Restore the original array order
        System.out.println("Bubble Sort Result:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

        // Testing quick sort (restore original array order)
        SortingAndSearching.quickSort(contacts, 0, contacts.length - 1); // Restore the original array order
        System.out.println("Quick Sort Result:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

        // Testing merge sort (restore original array order)
        SortingAndSearching.mergeSort(contacts, 0, contacts.length - 1); // Restore the original array order
        System.out.println("Merge Sort Result:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}
