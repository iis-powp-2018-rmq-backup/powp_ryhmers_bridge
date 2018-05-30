package edu.kis.vh.nursery.collections;

public interface CountingContainer {

    int LIST_EMPTY = 0;
    // przeniesienie tej zmiennej do interfejsu ułatwia ewentualną zmianę tej zmiennej w innych klasach

    boolean isEmpty();

    boolean isFull();

    void push(int i);

    int top();

    int pop();

    int getTotal();

}