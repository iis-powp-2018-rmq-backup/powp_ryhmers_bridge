package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntArrayStack;
import edu.kis.vh.nursery.stackandlist.IntLinkedList;

public class DefaultCountingOutRyhmer {

    private IntLinkedList intLinkedList;
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRyhmer() {
        intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        intLinkedList.countIn(in);
    }

    public boolean callCheck() {
        return intLinkedList.callCheck();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.peekaboo();
    }

    public int countOut() {
        return intLinkedList.countOut();
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

//Now we can dynamically switch between both implementations.