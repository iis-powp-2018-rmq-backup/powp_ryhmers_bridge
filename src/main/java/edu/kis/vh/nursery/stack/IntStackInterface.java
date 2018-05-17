package edu.kis.vh.nursery.stack;

public interface IntStackInterface {
    int IS_EMPTY = -1;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
