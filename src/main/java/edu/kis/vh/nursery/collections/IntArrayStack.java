package edu.kis.vh.nursery.collections;

public class IntArrayStack implements RhymersInterface {

    private static final int NUMBERS_CAPACITY = 12;

    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = EMPTY_STACK_VALUE;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }
}
