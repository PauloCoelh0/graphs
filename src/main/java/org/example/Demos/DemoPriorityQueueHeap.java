package org.example.Demos;

import org.example.Estruturas.PriorityQueue;
import org.example.Exceptions.EmptyCollectionException;

public class DemoPriorityQueueHeap {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Adding elements with priority
        priorityQueue.addElement("Task 1", 5); // Lower priority number
        priorityQueue.addElement("Task 2", 1); // Higher priority number

        priorityQueue.addElement("Task 3", 3);
        priorityQueue.addElement("Task 4", 2);
        priorityQueue.addElement("Task 5", 4);

        // Removing elements from the priority queue
        try {
            while (!priorityQueue.isEmpty()) {
                String task = priorityQueue.removeNext();
                System.out.println("Processing: " + task);
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }
}
