package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    public static final int emptyStack = -1;
    public static final int sizeOfStack = 11;
    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == emptyStack;
    }

    public boolean isFull() {
        return total == sizeOfStack;
    }

    protected int peekaboo() {
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
