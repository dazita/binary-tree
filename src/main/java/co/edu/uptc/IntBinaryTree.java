package co.edu.uptc;

public class IntBinaryTree{

    private Node<Integer> firstNode;

    public IntBinaryTree() {
    }

    public void add(Integer value) {
        Node<Integer> newNode = new Node<>(value);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node<Integer> lastNode = findWhereToAdd(value);
            if (value > lastNode.getValue()) {
                lastNode.setGreater(newNode);
            } else {
                lastNode.setMinor(newNode);
            }
        }
    }

    private Node<Integer> findWhereToAdd(Integer value) {
        Node<Integer> lastNode = firstNode;
        while (true) {
            if (value > lastNode.getValue()) {
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

    private void recursive(Node<Integer> aux) {
        if (aux != null) {
            recursive(aux.getMinor());
            System.out.println(aux.getValue());
            recursive(aux.getGreater());
        }
    }
}