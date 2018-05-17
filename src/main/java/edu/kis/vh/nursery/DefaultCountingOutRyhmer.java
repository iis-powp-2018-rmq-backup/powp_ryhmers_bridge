package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRyhmer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRyhmer() {
        intArrayStack = new IntArrayStack();
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

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int getCAPACITY() {
        return intArrayStack.getCAPACITY();
    }

    public int getEMPTY_STACK_VALUE() {
        return intArrayStack.getEMPTY_STACK_VALUE();
    }

    public int[] getNUMBERS() {
        return intArrayStack.getNUMBERS();
    }
    
    
}
