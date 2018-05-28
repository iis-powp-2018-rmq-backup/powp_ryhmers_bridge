package edu.kis.vh.nursery.stack;

public interface IntStackImplementation {
    /**
     * getter do zmiennej is_empty_indicator
     * @return pusta lista
     */

    int IS_EMPTY_INDICATOR = -1;

    int getSize();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
