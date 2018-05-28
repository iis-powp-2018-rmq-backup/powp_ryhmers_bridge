package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntStackImplementation;

public class IntArrayStack implements IntStackImplementation {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY_INDICATOR = -1;
    private int[] numbers = new int[getCAPACITY()]; // dostep do zmiennej odbywa sie poprzez funkcje get i set


    private static int getCAPACITY() {
        return CAPACITY;
    }

    private static int getIsEmptyIndicator() {
        return IS_EMPTY_INDICATOR;
    }

    public int getSize() {
        return total;
    }

    private int total = getIsEmptyIndicator();

    public void push(final int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean isEmpty() {
        return total == getIsEmptyIndicator();
    }

    public boolean isFull() {
        return total == CAPACITY -1;
    }

    public int top() {
        if (isEmpty())
            return getIsEmptyIndicator();
        return getNumbers()[total];
    }

    public int pop() {
        if (isEmpty())
            return getIsEmptyIndicator();
        return getNumbers()[total--];
    }

    private int[] getNumbers() {
        return numbers;
    }

}
