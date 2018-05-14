package edu.kis.vh.nursery;

//TODO: extract interface Ryhmer

//TODO: think about template method or strategy
public class DefaultCountingOutRyhmer {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY = -1;
    private int[] NUMBERS = new int[CAPACITY];

    private int total = IS_EMPTY;

    public void countIn(final int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }
}
