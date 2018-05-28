package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {

    public int getTotal() {
        return intLinkedList.getSize();
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

    IntLinkedList intLinkedList;

    public DefaultCountingOutRyhmer() {
        intLinkedList = new IntLinkedList();
    }
    public DefaultCountingOutRyhmer(IntLinkedList intLinkedList) {
        super();
        this.intLinkedList = intLinkedList;
    }



}
