package edu.kis.vh.nursery;

public class IntLinkedList {

    static final int NUMBERS_CAPACITY = 12;
    static final int EMPTY_STACK_VALUE = -1;
    IntArrayStack intArrayStack;

    public IntArrayStack getIntArrayStack() {
        return intArrayStack;
    }

    public void setIntArrayStack(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    int[] numbers = new int[NUMBERS_CAPACITY];
    int total = EMPTY_STACK_VALUE;

    public IntLinkedList() {
    }

    public int getTotal() {
        return total;
    }

    protected void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    protected boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }
}
