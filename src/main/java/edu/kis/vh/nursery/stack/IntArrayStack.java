package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack {
    private static final int NUMBERS_CAPACITY = 12;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = EMPTY_STACK;

    public void push(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return numbers[total];
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
