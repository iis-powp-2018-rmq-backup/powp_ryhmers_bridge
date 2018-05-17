package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRyhmer {
    private IntArrayStack stack;

    public DefaultCountingOutRyhmer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRyhmer() {
        stack = new IntArrayStack();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int countOut() {
        return stack.countOut();
    }

    public int getTotal() {
        return stack.getTotal();
    }
}
