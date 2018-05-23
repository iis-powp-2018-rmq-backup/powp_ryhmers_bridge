package edu.kis.vh.nursery;

public interface Stack {
    int IS_EMPTY = 0;

    void push(int i);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
}
// Realizacja zadania 3.1.10 pomogła mi w prosty sposób zmienić wartość zwracaną w przypadku pustego stosu na 0. Nie musiałam
//zmieniać tej wartości w kilku miejscach tylko jednym.