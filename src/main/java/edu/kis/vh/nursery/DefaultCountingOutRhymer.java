package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntArrayStack;
import edu.kis.vh.nursery.stackandlist.IntDataStructure;
import edu.kis.vh.nursery.stackandlist.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntDataStructure intDataStructure;

    public DefaultCountingOutRhymer(IntDataStructure intDataStructure) {
        this.intDataStructure = intDataStructure;
    }

    public DefaultCountingOutRhymer() {
        intDataStructure = new IntLinkedList();
    }

    public void countIn(int in) {
        intDataStructure.countIn(in);
    }

    public boolean callCheck() {
        return intDataStructure.callCheck();
    }

    public boolean isFull() {
        return intDataStructure.isFull();
    }

    public int peekaboo() {
        return intDataStructure.peekaboo();
    }

    public int countOut() {
        return intDataStructure.countOut();
    }
   
    public int getSize() {
        return intDataStructure.getSize();
    }
}

//Now we can dynamically switch between both implementations.