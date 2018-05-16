package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY_INDICATOR = -1;
    private int[] numbers = new int[CAPACITY];

    private int total = IS_EMPTY_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == IS_EMPTY_INDICATOR;
    }

    boolean isFull() {
        return total == CAPACITY-1;
    }

    int peekaboo() {
        if (callCheck())
            return IS_EMPTY_INDICATOR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY_INDICATOR;
        return numbers[total--];
    }

}
