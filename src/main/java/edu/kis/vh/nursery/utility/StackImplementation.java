package edu.kis.vh.nursery.utility;

public interface StackImplementation {

    static final int IS_EMPTY_INDICATOR = -1;

    void push(int i);

    int pop();

    int top();

    int getTotal();

    boolean isEmpty();

    boolean isFull();

}
