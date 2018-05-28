package edu.kis.vh.nursery.collection;

public interface StackInterface {
    //dzieki przeniesieniu tutaj stalej, zmiana jej wartosci zamyka sie w 3 kliknięciach co jest bardzo pomocne.
    int EMPTY_STACK_VALUE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
