package edu.kis.vh.nursery.stackandlist;

public class IntLinkedList implements IntDataStructure {

    private Node last;
    
    @Override
    public void countIn(final int value) {
        if (last == null) {
            last = new Node(value);
        } else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean callCheck() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        final int lastValue = last.getValue();
        last = last.prev;
        return lastValue;
    }

}
