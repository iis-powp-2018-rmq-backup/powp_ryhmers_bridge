package edu.kis.vh.nursery.stack;

public interface Stack {
    /**
     * Constant which indicates, if stack is empty
     */
    int EMPTY_STACK = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    /*Tak pomogła mi, ponieważ dzięki zastosowaniu wspólnego interfejsu
        zmiana wartości nastąpiła tylko w jednym miejscu w kodzie */
}
