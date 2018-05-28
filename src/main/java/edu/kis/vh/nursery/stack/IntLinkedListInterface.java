package edu.kis.vh.nursery.stack;

public interface IntLinkedListInterface {

    //Pomoglo ,poniewaz zmiane wprowadzam w jednym miejscu
    int emptyStack = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
