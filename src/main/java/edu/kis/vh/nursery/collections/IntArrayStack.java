package edu.kis.vh.nursery.collections;

public class IntArrayStack implements CountingContainer {
    private static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY];
    private int total = LIST_EMPTY;

    public int getTotal() {
        return total;
    }

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == LIST_EMPTY;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[total++] = i;
    }

    @Override
    public int top() {
        if (isEmpty())
            return LIST_EMPTY;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return LIST_EMPTY;
        return numbers[total--];
    }
}