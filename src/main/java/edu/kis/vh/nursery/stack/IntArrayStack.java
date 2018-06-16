package edu.kis.vh.nursery.stack;

public class IntArrayStack extends IntStackBaseClass {

    final private int[] NUMBERS;

    public IntArrayStack() {
        super();
        NUMBERS = new int[12];
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STRUCT_CODE;
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