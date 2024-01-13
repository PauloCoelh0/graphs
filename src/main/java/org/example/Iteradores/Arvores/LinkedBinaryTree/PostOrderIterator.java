package org.example.Iteradores.Arvores.LinkedBinaryTree;

import org.example.Estruturas.ArrayUnorderedList;
import org.example.Nodes.BinaryTreeNode;

import java.util.Iterator;

public class PostOrderIterator<T> implements Iterator<T> {
    private ArrayUnorderedList<T> tempList;
    private Iterator<T> iter;

    public PostOrderIterator(BinaryTreeNode<T> root) {
        tempList = new ArrayUnorderedList<T>();
        postorder(root);
        iter = tempList.iterator();
    }

    private void postorder(BinaryTreeNode<T> node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            tempList.addToRear(node.getElement());
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
