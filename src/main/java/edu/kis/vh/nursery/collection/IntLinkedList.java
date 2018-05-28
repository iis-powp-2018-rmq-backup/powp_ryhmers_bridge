package edu.kis.vh.nursery.collection;


/**
 * Class providing operations on the list of nodes
 */
public class IntLinkedList implements StackInterface {


    private Node last;

    private int total = EMPTY_STACK_VALUE;

    @Override public void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    @Override public boolean isEmpty() {
        return last == null;
    }

    @Override public boolean isFull() {
        return false;
    }

    @Override public int top() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return last.getValue();
    }

    @Override public int pop() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    @Override public int getTotal() {
        return total;
    }

    class Node {

        private int value;

        private Node prev;

        private Node next;

        Node(final int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(final Node next) {
            this.next = next;
        }
    }

}
