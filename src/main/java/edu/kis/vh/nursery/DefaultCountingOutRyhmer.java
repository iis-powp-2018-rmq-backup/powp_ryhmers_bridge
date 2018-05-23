package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Stack;

public class DefaultCountingOutRyhmer {

    private Stack stack;

    public DefaultCountingOutRyhmer() {
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRyhmer(Stack stack) {
        this.stack = stack;
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

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }


}
