package org.example.Iteradores.Arvores.LinkedBinaryTree;

import org.example.Estruturas.ArrayUnorderedList;
import org.example.Exceptions.EmptyCollectionException;
import org.example.Nodes.BinaryTreeNode;

import java.util.Iterator;

public class LevelOrderIterator<T> implements Iterator<T> {
    private ArrayUnorderedList<T> tempList;
    private Iterator<T> iter;

    public LevelOrderIterator(BinaryTreeNode<T> root) throws EmptyCollectionException {
        tempList = new ArrayUnorderedList<T>();
        levelOrder(root);
        iter = tempList.iterator();
    }

    private void levelOrder(BinaryTreeNode<T> root) throws EmptyCollectionException {
        ArrayUnorderedList<BinaryTreeNode<T>> nodes = new ArrayUnorderedList<BinaryTreeNode<T>>();
        nodes.addToRear(root);

        while (!nodes.isEmpty()) {
            BinaryTreeNode<T> current = nodes.removeFirst();

            if (current != null) {
                tempList.addToRear(current.getElement());

                if (current.getLeft() != null) {
                    nodes.addToRear(current.getLeft());
                }

                if (current.getRight() != null) {
                    nodes.addToRear(current.getRight());
                }
            }
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
