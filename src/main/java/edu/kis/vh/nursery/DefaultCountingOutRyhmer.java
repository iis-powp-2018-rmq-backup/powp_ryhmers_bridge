package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStackImplementation;

public class DefaultCountingOutRyhmer {
// klasa wykorzystujac wspolny interjejs moze korzystac teraz z IntArrayStack lub IntLinkedList
    public int getTotal() {
        return intLinkedList.getSize();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    IntStackImplementation intLinkedList;

    public DefaultCountingOutRyhmer() {
        intLinkedList = new IntLinkedList();
    }
    public DefaultCountingOutRyhmer(IntStackImplementation intLinkedList) {
        super();
        this.intLinkedList = intLinkedList;
    }



}
