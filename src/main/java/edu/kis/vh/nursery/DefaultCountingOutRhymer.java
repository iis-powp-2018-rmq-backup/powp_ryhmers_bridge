package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackImplementation;

public class DefaultCountingOutRhymer {

    private StackImplementation stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(StackImplementation stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getTotal();
    }

    protected int peekaboo() {
        return stack.top();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int countOut() {
        return stack.pop();
    }

}
