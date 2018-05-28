package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntLinkedListInterface {

    private static final int emptyStack = -1;
    private static final int sizeOfStack = 11;
    private static final int stackCapacity = 12;
    private int[] NUMBERS = new int[stackCapacity];

    private int total = -1;


    @Override
    public void push(int i) {
        if (!isFull())
            getNumbers()[++total] = i;
    }

    private int[] getNumbers() {
        return NUMBERS;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return emptyStack;
        return getNumbers()[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return emptyStack;
        return getNumbers()[total--];
    }


}