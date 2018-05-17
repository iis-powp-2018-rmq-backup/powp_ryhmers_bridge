package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStackInterface {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY = -1;
    private final int[] numbers = new int[CAPACITY];

    private int size = IS_EMPTY;

    @Override
    public void push(final int in) {
        if (!isFull())
            numbers[++size] = in;
    }

    @Override
    public boolean isEmpty() {
        return size == IS_EMPTY;
    }

    @Override
    public boolean isFull() {
        return size == CAPACITY - 1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return numbers[size];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IS_EMPTY;
        return numbers[size--];
    }

    @Override
    public int getSize() {
        return size;
    }
}
