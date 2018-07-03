package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int capacity = 12;
    private static final int empty = -1;
    private int total = -1;
    private int[] NUMBERS = new int[capacity];

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return empty;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return empty;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
