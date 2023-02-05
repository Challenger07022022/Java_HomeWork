package algorithms.HW4;

import java.util.Objects;

// Реализовать метод contains в классе Tree

public class Tree<T extends Comparable<T>> {

    private Node root;

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T value) {
        Objects.requireNonNull(value);
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }

        return current;
    }

    public boolean contains(T value) {
        Objects.requireNonNull(value);
        return containsRec(root, value);
    }

    private boolean containsRec(Node currentNode, T value) {
        if (currentNode == null)
            return false;
        if (value.compareTo(currentNode.value) == 0)
            return true;
        if (value == currentNode.value)
            return true;
        if (value.compareTo(currentNode.value) < 0)
            return containsRec(currentNode.left, value);
        return containsRec(currentNode.right, value);
    }

    public static void main(String[] args) {
        Tree<Integer> integerTree = new Tree<>();
        integerTree.add(5);
        integerTree.add(1);
        integerTree.add(7);
        integerTree.add(8);
        integerTree.add(2);
        integerTree.add(3);
        integerTree.add(9);

        if (integerTree.contains(1))
            System.out.println("Данное число есть!");
        else System.out.println("Данное число не найдено!");
    }
}