package edu.kis.vh.nursery.collections;

public interface Container {

    int DEFAULT_START_VALUE = -1;

    boolean isEmpty();

    boolean isFull();

    void push(int i);

    int top();

    int pop();

    int getTotal();

}
