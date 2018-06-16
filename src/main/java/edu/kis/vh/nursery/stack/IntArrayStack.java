package edu.kis.vh.nursery.stack;

import lombok.Getter;

public class IntArrayStack implements IStackImplementation {

    final private int[] NUMBERS;

    @Getter
    private int total;

    private final int totalMax;

    private final static int EMPTY_STRUCT_CODE = -1;

    public IntArrayStack() {
        NUMBERS = new int[12];
        total = -1;
        totalMax = 11;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STRUCT_CODE;
    }

    @Override
    public boolean isFull() {
        return total == totalMax;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_STRUCT_CODE;
        }
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STRUCT_CODE;
        }
        return NUMBERS[total--];
    }

    @Override
    public void push(final int input) {
        if (!isFull()) {
            total = total + 1;
            NUMBERS[total] = input;
        }
    }

}