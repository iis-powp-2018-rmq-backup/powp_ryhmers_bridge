package edu.kis.vh.nursery;

public class IntArrayStack {

    final private int[] NUMBERS;
    private int total;
    private final int totalMax;
    private final static int EMPTY_STRUCT_CODE = -1;

    public IntArrayStack() {
        NUMBERS = new int[12];
        total = -1;
        totalMax = 11;
    }

    public boolean callCheck() {
        return total == EMPTY_STRUCT_CODE;
    }

    public boolean isFull() {
        return total == totalMax;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return EMPTY_STRUCT_CODE;
        }
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_STRUCT_CODE;
        }
        return NUMBERS[total--];
    }

    public void countIn(final int input) {
        if (!isFull()) {
            total = total + 1;
            NUMBERS[total] = input;
        }
    }

}