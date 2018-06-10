package edu.kis.vh.nursery.stack;

public class IntLinkedList implements IntLinkedListInterface {

    private static final int IS_EMPTY_TOP = -1;
    private Node last;
    private int i;

    @Override
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IS_EMPTY_TOP;
        return getLast().getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IS_EMPTY_TOP;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
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
