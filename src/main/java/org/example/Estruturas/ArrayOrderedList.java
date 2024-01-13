package org.example.Estruturas;

import org.example.Interfaces.OrderedListADT;

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {

    @Override
    public void add(T element) {

        if (size() == list.length) {
            expandCapacity();
        }

        Comparable<T> temp = (Comparable<T>)element;

        int index = 0;

        while (index < rear && temp.compareTo(list[index]) > 0) {
            index++;
        }

        for (int i = rear; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
        rear++;
        modCount++;
    }


}