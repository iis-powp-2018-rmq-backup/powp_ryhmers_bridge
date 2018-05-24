package edu.kis.vh.nursery.collection;

public interface Stack {
    /**
     * Default value returned by methods when the list is empty
     */
    int DEFAULT_EMPTY_STACK_VALUE = -1;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
