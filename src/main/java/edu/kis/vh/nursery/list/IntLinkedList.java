package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private final int EMPTY = -1;
    
    public void push(final int value) {
        if (last == null) {
            last = new Node(value);
        } else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
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
            return EMPTY;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY;
        }
        final int lastValue = last.getValue();
        last = last.prev;
        return lastValue;
    }

}
