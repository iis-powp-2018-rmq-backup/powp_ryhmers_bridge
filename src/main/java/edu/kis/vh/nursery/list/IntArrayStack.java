package edu.kis.vh.nursery.list;

public class IntArrayStack {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = IS_EMPTY;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    public int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
