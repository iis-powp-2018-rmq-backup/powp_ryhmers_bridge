package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.IntLinkedListInterface;

public class IntArrayStack implements IntLinkedListInterface {

    private static final int IS_EMPTY_TOTAl = -1;
    private static final int CAPACITY = 11;
    private final int[] NUMBERS = new int[12];

    private int total = IS_EMPTY_TOTAl;


    @Override
    public void push(int i) {
        if(!isFull())
            NUMBERS[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        if (total == IS_EMPTY_TOTAl)
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
            return IS_EMPTY_TOTAl;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if(isEmpty())
            return IS_EMPTY_TOTAl;
        return NUMBERS[total--];
    }
}
