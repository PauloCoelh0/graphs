package org.example.Estruturas;

import org.example.Exceptions.ElementNotFoundException;
import org.example.Interfaces.UnorderedListADT;

public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {

//    public ArrayUnorderedList() {
//        super();
//    }
//
//    public ArrayUnorderedList(int initialCapacity) {
//        super(initialCapacity);
//    }

    @Override
    public void addToFront(T element) {
        if (rear == list.length) {
            expandCapacity();
        }

        // Shift elements to make space for the new element at the front
        for (int i = rear; i > 0; i--) {
            list[i] = list[i - 1];
        }

        list[0] = element;
        rear++;
        modCount++;
    }

    @Override
    public void addToRear(T element) {
        if (rear == list.length) {
            expandCapacity();
        }

        list[rear] = element;
        rear++;
        modCount++;
    }

    @Override
    public void addAfter(T element, T target) throws ElementNotFoundException {
        int targetIndex = -1;

        // Find the index of the target element
        for (int i = 0; i < rear; i++) {
            if (target.equals(list[i])) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex == -1) {
            throw new ElementNotFoundException("ArrayList");
        }

        if (rear == list.length) {
            expandCapacity();
        }

        // Shift elements to make space for the new element
        for (int i = rear; i > targetIndex + 1; i--) {
            list[i] = list[i - 1];
        }

        list[targetIndex + 1] = element;
        rear++;
        modCount++;
    }

}