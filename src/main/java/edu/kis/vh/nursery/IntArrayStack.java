package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int emptyStack = -1;
    private static final int sizeOfStack = 11;
    private static final int stackCapacity = 12;
    private int[] NUMBERS = new int[stackCapacity];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    private int getTotal() {
        return total;
    }

    boolean callCheck() {
        return getTotal() == emptyStack;
    }

    boolean isFull() {
        return getTotal() == sizeOfStack;
    }

    int peekaboo() {
        if (callCheck())
            return emptyStack;
        return NUMBERS[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return emptyStack;
        return NUMBERS[total--];
    }

}