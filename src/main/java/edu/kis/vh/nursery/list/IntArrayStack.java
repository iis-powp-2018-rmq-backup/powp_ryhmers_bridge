package edu.kis.vh.nursery.list;

public class IntArrayStack {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY = -1;
    private final int[] numbers = new int[CAPACITY];

    private int size = IS_EMPTY;

    public void push(final int in) {
        if (!isFull())
            numbers[++size] = in;
    }

    public boolean isEmpty() {
        return size == IS_EMPTY;
    }

    public boolean isFull() {
        return size == CAPACITY - 1;
    }

    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return numbers[size];
    }

    public int pop() {
        if (isEmpty())
            return IS_EMPTY;
        return numbers[size--];
    }

    public int getSize() {
        return size;
    }
}
