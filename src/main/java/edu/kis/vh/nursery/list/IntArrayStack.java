package edu.kis.vh.nursery.list;

public class IntArrayStack implements StackImplementation {

    private static final int IS_EMPTY_INDICATOR = -1;

    private static final int CAPACITY = 12;

    private int[] numbers = new int[CAPACITY];

    private int total = IS_EMPTY_INDICATOR;

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void push(final int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    @Override
    public boolean isEmpty() {
        return total == IS_EMPTY_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return IS_EMPTY_INDICATOR;
        }
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return IS_EMPTY_INDICATOR;
        }
        return numbers[total--];
    }

}
