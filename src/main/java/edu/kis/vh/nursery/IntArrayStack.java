package edu.kis.vh.nursery;

public class IntArrayStack implements IntContainer {
    static final int capacity = 12;
    static final int empty = -1;
    int total = -1;
    int[] NUMBERS = new int[capacity];

    public IntArrayStack() {
    }

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

    public int peekaboo() {
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