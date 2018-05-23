package edu.kis.vh.nursery.collections;

public interface RhymersInterface {
    int EMPTY_STACK_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
//Realizacja zadania 10 pomogła w wykonaniu 11 ponieważ pozwoliła na zmianę wartości tylko w jednym miejscu (interfejsie)