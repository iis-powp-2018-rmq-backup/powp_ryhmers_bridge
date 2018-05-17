package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
    Node last;

    public void push(final int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_STACK_VALUE;
        }
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
    
    public class Node {

        private final int value;
        private Node prev, next;

        public Node(final int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
