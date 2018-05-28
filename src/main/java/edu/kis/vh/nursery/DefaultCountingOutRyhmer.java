package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {

    public DefaultCountingOutRyhmer(IntLinkedList IntLinkedList) {
        this.IntLinkedList = IntLinkedList;
    }

    public DefaultCountingOutRyhmer(){
        super();
        this.IntLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        IntLinkedList.push(in);
    }

    public boolean callCheck() {
        return IntLinkedList.isEmpty();
    }

    public boolean isFull() {
        return IntLinkedList.isFull();
    }

    public int peekaboo() {
        return IntLinkedList.top();
    }

    public int countOut() {
        return IntLinkedList.pop();
    }

    private IntLinkedList IntLinkedList;

}
