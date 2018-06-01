package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stack;

public class DefaultCountingOutRhymer {

    
    private Stack stack;

    public DefaultCountingOutRhymer() {
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stack stack) {
        this.stack = stack;
    }

    protected void countIn(int in) {
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

    protected int getTotal() {
        return stack.getTotal();
    }
}