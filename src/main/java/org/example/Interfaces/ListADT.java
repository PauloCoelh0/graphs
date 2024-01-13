package org.example.Interfaces;

import org.example.Exceptions.ElementNotFoundException;

import java.util.Iterator;

public interface ListADT<T> extends Iterable{


    public T removeFirst();

    public T removeLast();

    public T remove (T element) throws ElementNotFoundException;

    public T first();

    public T last();

    public boolean contains (T target);

    public boolean isEmpty();

    public int size();

    public Iterator<T> iterator();

    @Override
    public String toString();

}