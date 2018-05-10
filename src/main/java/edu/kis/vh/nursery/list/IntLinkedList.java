package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int VALUE_IF_EMPTY = -1;
    private Node last;

    protected void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    protected boolean isEmpty() {
        return last == null;
    }

    protected boolean isFull() {
        return false;
    }

    protected int top() {
        if (isEmpty()) {
            return VALUE_IF_EMPTY;
        }
        return last.value;
    }

    protected int pop() {
        if (isEmpty()) {
            return VALUE_IF_EMPTY;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
