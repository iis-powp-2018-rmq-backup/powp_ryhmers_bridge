package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStackInterface;

public class DefaultCountingOutRyhmer {
    private IntStackInterface list;

    public DefaultCountingOutRyhmer(IntStackInterface list) {
        this.list = list;
    }

    public DefaultCountingOutRyhmer() {
        list = new IntLinkedList();
    }

    public int peekaboo() {
        return list.top();
    }

    public void countIn(int in) {
        list.push(in);
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int countOut() {
        return list.pop();
    }

    public int getTotal() {
        return list.getSize();
    }
}

//Dzięki tej zmianie dynamicznie możemy decydować o wykorzystaniu
//IntLinkedList bądź IntArrayStack