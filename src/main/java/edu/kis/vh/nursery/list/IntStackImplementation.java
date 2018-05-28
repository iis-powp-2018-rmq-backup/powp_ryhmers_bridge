package edu.kis.vh.nursery.list;

public interface IntStackImplementation {
    /**
     * getter do zmiennej is_empty_indicator
     * @return pusta lista
     */

    int getSize();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
