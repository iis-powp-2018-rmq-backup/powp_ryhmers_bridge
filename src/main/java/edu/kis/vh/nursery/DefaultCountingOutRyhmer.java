package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.StackInterface;

public class DefaultCountingOutRyhmer {

    private StackInterface stack;

    public DefaultCountingOutRyhmer() {
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRyhmer(StackInterface stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getTotal();
    }

    protected void countIn(final int in) {
        stack.push(in);
    }

    protected boolean callCheck() {
        return stack.isEmpty();
    }

    protected boolean isFull() {
        return stack.isFull();
    }

    protected int peekaboo() {
        return stack.top();
    }

    protected int countOut() {
        return stack.pop();
    }

}
