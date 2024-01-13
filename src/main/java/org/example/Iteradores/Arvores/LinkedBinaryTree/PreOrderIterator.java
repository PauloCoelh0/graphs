package org.example.Iteradores.Arvores.LinkedBinaryTree;

import org.example.Estruturas.ArrayUnorderedList;
import org.example.Nodes.BinaryTreeNode;

import java.util.Iterator;

public class PreOrderIterator<T> implements Iterator<T> {
    private ArrayUnorderedList<T> tempList;
    private Iterator<T> iter;

    public PreOrderIterator(BinaryTreeNode<T> root) {
        tempList = new ArrayUnorderedList<T>();
        preorder(root);
        iter = tempList.iterator();
    }

    private void preorder(BinaryTreeNode<T> node) {
        if (node != null) {
            tempList.addToRear(node.getElement());
            preorder(node.getLeft());
            preorder(node.getRight());
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
