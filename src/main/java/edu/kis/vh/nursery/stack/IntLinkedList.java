package edu.kis.vh.nursery.stack;

public class IntLinkedList extends IntStackBaseClass {

    private Node last;

    public IntLinkedList() {
        super();
    }

    @Override
    public void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }

        total = total + 1;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_STRUCT_CODE;
        }
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STRUCT_CODE;
        }
        int returnValue = last.getValue();
        last = last.getPrev();
        return returnValue;
    }

}