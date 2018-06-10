package edu.kis.vh.nursery.stack;

public interface IntLinkedListInterface {

    int IS_EMPTY = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
