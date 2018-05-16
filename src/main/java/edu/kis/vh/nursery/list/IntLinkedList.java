package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IS_EMPTY_TOP = -1;
    private Node last;
    private int i;

    private static int getIsEmptyTop() {
        return IS_EMPTY_TOP;
    }

    private void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return getIsEmptyTop();
        return getLast().getValue();
    }

    private int pop() {
        if (isEmpty())
            return getIsEmptyTop();
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    private Node getLast() {
        return last;
    }

    private void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }
}
