package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {
    private IntLinkedList linkedList;

    public DefaultCountingOutRyhmer(IntLinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public DefaultCountingOutRyhmer() {
        linkedList = new IntLinkedList();
    }

    public int peekaboo() {
        return linkedList.top();
    }

    public void countIn(int in) {
        linkedList.push(in);
    }

    public boolean callCheck() {
        return linkedList.isEmpty();
    }

    public boolean isFull() {
        return linkedList.isFull();
    }

    public int countOut() {
        return linkedList.pop();
    }

    public int getTotal() {
        return linkedList.getSize();
    }
}
