package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }


    public DefaultCountingOutRyhmer() {
        super();
    }
}
