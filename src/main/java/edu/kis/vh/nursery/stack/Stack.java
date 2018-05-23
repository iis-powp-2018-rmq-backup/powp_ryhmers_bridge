package edu.kis.vh.nursery.stack;

public interface Stack {
    /**
     * Constant which indicates, if stack is empty
     */
    int EMPTY_STACK = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
