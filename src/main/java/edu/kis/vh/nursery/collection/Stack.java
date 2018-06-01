package edu.kis.vh.nursery.collection;

public interface Stack {
    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}