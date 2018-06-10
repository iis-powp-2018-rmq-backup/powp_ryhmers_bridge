package edu.kis.vh.nursery.stack;

public interface IntLinkedListInterface {

    int IS_EMPTY = 0;

    //Wczesniej wykonany punk 3.1.10 umozliwil zmiane tylko w jednym miejscu zamiast w dwoch

    //IntelliJ Navigate > Go To oraz ctrl + lewy przycisk myszki daja ten sam efekt

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
