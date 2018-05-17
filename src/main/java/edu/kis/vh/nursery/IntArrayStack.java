package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int NUMBERS_CAPACITY = 12;
    private static final int NO_NUMBERS = -1;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = NO_NUMBERS;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    protected boolean callCheck() {
        return total == NO_NUMBERS;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return NO_NUMBERS;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return NO_NUMBERS;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
