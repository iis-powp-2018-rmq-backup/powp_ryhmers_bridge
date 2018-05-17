package edu.kis.vh.nursery.stack;

public interface IntStackInterface {
    int IS_EMPTY = 0;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}

//Tak, pomogła realizacja zadania 10, nie trzeba było tego zmieniać w dwóch klasach