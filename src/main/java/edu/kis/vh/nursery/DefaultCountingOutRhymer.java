package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntStack;

public class DefaultCountingOutRhymer {
    IntStack intLinkedList = new IntStack();

    public DefaultCountingOutRhymer() {
        super();
    }

    public DefaultCountingOutRhymer(IntStack intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

}
