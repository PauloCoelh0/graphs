package org.example.Iteradores.Arvores.LinkedBinaryTree;

import org.example.Estruturas.ArrayUnorderedList;
import org.example.Nodes.BinaryTreeNode;

import java.util.Iterator;

public class InOrderIterator<T> implements Iterator<T> {
    private final ArrayUnorderedList<T> tempList;
    private final Iterator<T> iter;

    public InOrderIterator(BinaryTreeNode<T> root) {
        tempList = new ArrayUnorderedList<T>();
        inorder(root);
        iter = tempList.iterator();
    }

    private void inorder(BinaryTreeNode<T> node) {
        if (node != null) {
            inorder(node.getLeft());
            tempList.addToRear(node.getElement());
            inorder(node.getRight());
        }
    }

    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }

    @Override
    public T next() {
        return iter.next();
    }
}

