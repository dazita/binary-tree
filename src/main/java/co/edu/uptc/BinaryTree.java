package co.edu.uptc;

import java.util.Comparator;

public class BinaryTree<T> {

    private Node<T> firstNode;
    private Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean add(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node<T> lastNode = findWhereToAdd(value);
            if (comparator.compare(value, lastNode.getValue()) > 0) {
                lastNode.setGreater(newNode);
            } else {
                lastNode.setMinor(newNode);
            }
        }
        return true;
    }

    private Node<T> findWhereToAdd(T value) {
        Node<T> lastNode = firstNode;
        while (true) {
            if (comparator.compare(value, lastNode.getValue()) > 0) {
                if (lastNode.getGreater() != null) {
                    lastNode = lastNode.getGreater();
                } else {
                    return lastNode;
                }
            } else {
                if (lastNode.getMinor() != null) {
                    lastNode = lastNode.getMinor();
                } else {
                    return lastNode;
                }
            }
        }
    }

    public void showOrdered() {
        recursive(firstNode);
    }

    private void recursive(Node<T> aux) {
        if (aux != null) {
            recursive(aux.getMinor());
            System.out.println(aux.getValue());
            recursive(aux.getGreater());
        }
    }
}