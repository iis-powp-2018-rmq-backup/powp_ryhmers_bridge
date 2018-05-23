package edu.kis.vh.nursery.collections;

public class IntArrayStack implements Container {
    private static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY];
    private int total = DEFAULT_START_VALUE;

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == DEFAULT_START_VALUE;
    }

    @Override
    public boolean isEmpty() {
        return total == DEFAULT_START_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    @Override
    public int top() {
        if (callCheck())
            return DEFAULT_START_VALUE;

        return numbers[total];
    }

    @Override
    public int pop() {
        if (callCheck())
            return DEFAULT_START_VALUE;

        return numbers[total--];
    }
}
