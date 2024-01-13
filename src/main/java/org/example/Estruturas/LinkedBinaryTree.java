package org.example.Estruturas;

import org.example.Exceptions.ElementNotFoundException;
import org.example.Exceptions.EmptyCollectionException;
import org.example.Interfaces.BinaryTreeADT;
import org.example.Iteradores.Arvores.LinkedBinaryTree.InOrderIterator;
import org.example.Iteradores.Arvores.LinkedBinaryTree.LevelOrderIterator;
import org.example.Iteradores.Arvores.LinkedBinaryTree.PostOrderIterator;
import org.example.Iteradores.Arvores.LinkedBinaryTree.PreOrderIterator;
import org.example.Nodes.BinaryTreeNode;

import java.util.Iterator;

public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {

    protected int count;
    protected BinaryTreeNode<T> root;

    public LinkedBinaryTree() {
        count = 0;
        root = null;
    }

    public LinkedBinaryTree(T element) {
        count = 1;
        root = new BinaryTreeNode<T>(element);
    }

    @Override
    public T getRoot() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Erro: Lista Vazia");
        }
        return root.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T targetElement) throws ElementNotFoundException {
        return find(targetElement) != null;
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException {
        BinaryTreeNode<T> current = findAgain(targetElement, root);

        if (current == null) {
            throw new ElementNotFoundException("binary tree");
        }

        return (current.getElement());
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        return new InOrderIterator<T>(root);
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        return new PreOrderIterator<T>(root);
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        return new PostOrderIterator<T>(root);
    }

    @Override
    public Iterator<T> iteratorLevelOrder() throws EmptyCollectionException {
        return new LevelOrderIterator<T>(root);
    }

    private BinaryTreeNode<T> findAgain(T targetElement, BinaryTreeNode<T> next) {
        if (next == null) {
            return null;
        }

        if (next.getElement().equals(targetElement)) {
            return next;
        }

        BinaryTreeNode<T> temp = findAgain(targetElement, next.getLeft());

        if (temp == null) {
            temp = findAgain(targetElement, next.getRight());
        }

        return temp;
    }
}