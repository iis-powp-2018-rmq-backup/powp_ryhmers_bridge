package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntLinkedListInterface;

public class DefaultCountingOutRhymer {
    IntLinkedListInterface intintStack = new IntLinkedList();

    public DefaultCountingOutRhymer() {
        super();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intintStack = intLinkedList;
    }

    public void countIn(int in) {
        intintStack.push(in);
    }

    public boolean callCheck() {
        return intintStack.isEmpty();
    }

    public boolean isFull() {
        return intintStack.isFull();
    }

    public int peekaboo() {
        return intintStack.top();
    }

    public int countOut() {
        return intintStack.pop();
    }

}
