package edu.kis.vh.nursery.stack;

public interface IStackImplementation {
    void push(int i);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
    int getTotal();
}

// F3 - definicje.
// ctrl,+,t  - Pokazuje miejsca gdzie zaimplementowano metodę
// ctrl,+,myszka - Pozwala na wybór jednej z tych dwóch opcji.