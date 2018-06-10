package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntLinkedListInterface;

// Klasa DefaultCountingOutRhymer może teraz używac obydwu implementacji

public class DefaultCountingOutRhymer {
    IntLinkedListInterface intStack = new IntLinkedList();

    public DefaultCountingOutRhymer() {
        super();
    }

    public DefaultCountingOutRhymer(IntLinkedList intStacks) {
        this.intStack = intStacks;
    }

    public void countIn(int in) {
        intStack.push(in);
    }

    public boolean callCheck() {
        return intStack.isEmpty();
    }

    public boolean isFull() {
        return intStack.isFull();
    }

    public int peekaboo() {
        return intStack.top();
    }

    public int countOut() {
        return intStack.pop();
    }

}
