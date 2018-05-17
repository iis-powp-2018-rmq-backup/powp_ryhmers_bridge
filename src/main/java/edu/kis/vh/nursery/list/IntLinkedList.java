package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private final int EMPTY_STACK_VALUE = -1;
    
    public void countIn(final int value) {
        if (last == null) {
            last = new Node(value);
        } else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean callCheck() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        final int lastValue = last.getValue();
        last = last.prev;
        return lastValue;
    }

}
