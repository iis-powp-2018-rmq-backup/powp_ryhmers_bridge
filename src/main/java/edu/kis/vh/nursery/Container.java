package edu.kis.vh.nursery;

public interface Container {

    boolean isEmpty();

    boolean isFull();

    void push(int i);

    int top();

    int pop();

    int getTotal();

}
