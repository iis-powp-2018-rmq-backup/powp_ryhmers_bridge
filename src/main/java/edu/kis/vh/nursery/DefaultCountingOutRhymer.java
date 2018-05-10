package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int IS_EMPTY_TOTAl = -1;
    private static final int CAPACITY = 11;
    private int[] NUMBERS = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = IS_EMPTY_TOTAl;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY_TOTAl;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY_TOTAl;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY_TOTAl;
        return NUMBERS[total--];
    }

}
