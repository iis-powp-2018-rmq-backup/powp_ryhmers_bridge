package edu.kis.vh.nursery;

class IntArrayStack {
    private static final int NUMBERS_EMPTY = -1;
    private static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY];
    private int total = NUMBERS_EMPTY;

    int getTotal() {
        return total;
    }

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == NUMBERS_EMPTY;
    }

    boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    int peekaboo() {
        if (callCheck())
            return NUMBERS_EMPTY;

        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return NUMBERS_EMPTY;

        return numbers[total--];
    }
}