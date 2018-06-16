package edu.kis.vh.nursery.stack;

import lombok.Getter;

public class IntLinkedList implements IStackImplementation {

    private Node last;

    @Getter
    private int total;

    private int totalMax;

    private final static int EMPTY_STRUCT_CODE = -1;

    public IntLinkedList() {
        total = EMPTY_STRUCT_CODE;
        totalMax = 11;
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
    public boolean isFull() {
        return total == totalMax;
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