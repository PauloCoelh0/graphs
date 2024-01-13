package org.example.Nodes;

public class DoublyNode<T> {

    private T element;
    private DoublyNode<T> next;
    private DoublyNode<T> prev;

    public DoublyNode(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public T getData() {
        return element;
    }

    public void setData(T element){
        this.element = element;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next){
        this.next = next;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }
}