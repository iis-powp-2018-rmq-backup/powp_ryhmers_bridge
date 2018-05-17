package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Container;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer {

    private Container container;

    public DefaultCountingOutRhymer(Container container) {
        this.container = container;
    }

    public DefaultCountingOutRhymer(){
        this.container = new IntLinkedList();
    }

    public int getTotal() {
        return container.getTotal();
    }

    public void countIn(int in) {
        container.push(in);
    }

    public boolean callCheck() {
        return container.isEmpty();
    }

    public boolean isFull() {
        return container.isFull();
    }

    public int peekaboo() {
        return container.top();
    }

    public int countOut() {
        return container.pop();
    }


}
