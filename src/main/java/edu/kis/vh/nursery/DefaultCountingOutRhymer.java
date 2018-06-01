package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    protected void countIn(int in) {
        intLinkedList.push(in);
    }

    protected boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    protected boolean isFull() {
        return intLinkedList.isFull();
    }

    protected int peekaboo() {
        return intLinkedList.top();
    }

    protected int countOut() {
        return intLinkedList.pop();
    }

    protected int getTotal() {
        return intLinkedList.getTotal();
    }
}