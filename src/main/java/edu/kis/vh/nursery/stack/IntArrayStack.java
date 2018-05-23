package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack {
    private static final int NUMBERS_CAPACITY = 12;
    private static final int NO_NUMBERS = -1;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = NO_NUMBERS;

    public void push(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean isEmpty() {
        return total == NO_NUMBERS;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    public int top() {
        if (isEmpty()) {
            return NO_NUMBERS;
        }
        return numbers[total];
    }

    public int pop() {
        if (isEmpty()) {
            return NO_NUMBERS;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
