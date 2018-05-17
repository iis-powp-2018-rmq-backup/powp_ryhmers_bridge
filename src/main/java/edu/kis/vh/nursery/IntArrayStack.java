package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int IS_EMPTY_TOTAl = -1;
    private static final int CAPACITY = 11;
    private final int[] NUMBERS = new int[12];

    private int total = IS_EMPTY_TOTAl;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == IS_EMPTY_TOTAl;
    }

    boolean isFull() {
        return total == CAPACITY;
    }

    int peekaboo() {
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
