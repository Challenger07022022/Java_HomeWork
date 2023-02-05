package algorithms.HW3;

// 1. Реализовать методы addFirst, removeFirst.
// 2. Реализовать методы разворота связного списка.

import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode b = null;

        ListNode c = ListNodeUtils.addFirst(b, 2);
        System.out.println(c);
        ListNode d = ListNodeUtils.removeFirst(a);
        System.out.println(d);
        System.out.println(ListNodeUtils.revertList(a));

    }


    public static class ListNode implements Iterable<Integer> {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {
            ListNode node = this;
            return new ListNode.ListNodeIterator(node);
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("[");
            ListNode iterator = this;
            while (iterator != null) {
                builder.append(iterator.val).append(" -> ");
                iterator = iterator.next;
            }

            builder.append("]");

            return builder.toString();
        }

        private static class ListNodeIterator implements Iterator<Integer> {

            private ListNode node;

            public ListNodeIterator(ListNode node) {
                this.node = node;
            }

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Integer next() {
                int toReturn = node.val;
                node = node.next;
                return toReturn;
            }
        }
    }

    public static class ListNodeUtils {

        public static ListNode addFirst(ListNode node, int value) {
            return new ListNode(value, node);
        }

        public static ListNode removeFirst(ListNode node) {
            if (node == null) {
                return null;
            } else {
                return node.next;
            }
        }

        public static ListNode revertList(ListNode node) {
            if (node == null) {
                return null;
            } else {
                return revertListRecur(node, null);
            }
        }

        private static ListNode revertListRecur(ListNode currentNode, ListNode previousNode) {
            if (currentNode.next != null) {
                ListNode next = currentNode.next;
                currentNode.next = previousNode;
                return revertListRecur(next, currentNode);
            }
            currentNode.next = previousNode;
            return currentNode;
        }
    }
}