package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int VALUE_IF_EMPTY = -1;

    private static final int CAPACITY = 12;

    private int[] NUMBERS = new int[CAPACITY];

    public int totalIfEmpty = VALUE_IF_EMPTY;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++totalIfEmpty] = in;
        }
    }

    public boolean callCheck() {
        return totalIfEmpty == -1;
    }

    public boolean isFull() {
        return totalIfEmpty == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[totalIfEmpty];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[totalIfEmpty--];
    }

}
