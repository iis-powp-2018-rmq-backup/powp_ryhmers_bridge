package edu.kis.vh.nursery.collection;

public class IntArrayStack implements Stack {
    private static final int NUMBERS_CAPACITY = 12;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = DEFAULT_EMPTY_STACK_VALUE;

    @Override
    public void push(final int in) {
        if (!isFull())
            numbers[total++] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == DEFAULT_EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == NUMBERS_CAPACITY + DEFAULT_EMPTY_STACK_VALUE;
    }

    @Override
    public int top() {
        if (isEmpty())
            return DEFAULT_EMPTY_STACK_VALUE;
        return numbers[total];
    }

    @Override
    public int pop() {

        if (isEmpty())
            return DEFAULT_EMPTY_STACK_VALUE;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }
}
