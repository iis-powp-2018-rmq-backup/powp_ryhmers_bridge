package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_START_VALUE = -1;
    public static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY];
    public int total = DEFAULT_START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_START_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_START_VALUE;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_START_VALUE;

        return numbers[total--];
    }

}
