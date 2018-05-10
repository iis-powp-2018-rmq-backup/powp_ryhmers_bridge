package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    private static final int emptyStack = -1;
    private static final int sizeOfStack = 11;
    private int[] NUMBERS = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    boolean callCheck() {
        return total == emptyStack;
    }

    boolean isFull() {
        return total == sizeOfStack;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
