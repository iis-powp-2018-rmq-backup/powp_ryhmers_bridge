package edu.kis.vh.nursery.collection;

public interface Stack {
    /**
     * Default value returned by methods when the list is empty
     */
    //Thanks to moving this constant to interface we have possibility of changing its value only here and it will be reflected by all implementations
    int DEFAULT_EMPTY_STACK_VALUE = 0;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
