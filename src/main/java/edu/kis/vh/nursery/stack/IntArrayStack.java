package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class IntArrayStack implements IntLinkedListInterface {


    private static final int CAPACITY = 11;
    private final int[] NUMBERS = new int[12];

    private int total = IntLinkedList.IS_EMPTY;

    public IntArrayStack() {}

    public IntArrayStack(int total) {
        this.total = total;
    }

    @Override
    public void push(int i) {
        if(!isFull())
            NUMBERS[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        if (total == IntLinkedList.IS_EMPTY)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (total == CAPACITY)
            return true;
        return false;
    }

    @Override
    public int top() {
        if(isEmpty())
            return IntLinkedList.IS_EMPTY;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if(isEmpty())
            return IntLinkedList.IS_EMPTY;
        return NUMBERS[total--];
    }
}
