package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IS_EMPTY_INDICATOR = -1;
    private Node last; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    private int i; // dostep do zmiennej odbywa sie poprzez funkcje get i set

    public static int getIsEmptyIndicator() {
        return IS_EMPTY_INDICATOR;
    }

    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.prev = getLast();
            setLast(getLast().next);
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return getIsEmptyIndicator();
        return getLast().value;
    }

    public int pop() {
        if (isEmpty())
            return getIsEmptyIndicator();
        int ret = getLast().value;
        setLast(getLast().prev);
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

}
