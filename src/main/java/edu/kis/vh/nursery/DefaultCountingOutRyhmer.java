package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class DefaultCountingOutRyhmer {
// klasa wykorzystujac wspolny interjejs moze korzystac teraz z IntArrayStack lub IntLinkedList
    //Wszystkie klasy Ryhmers lamia ta zasade, brak im wspolnego interfejsu.
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

    IntStackInterface intLinkedList;

    public DefaultCountingOutRyhmer() {
        intLinkedList = new IntLinkedList();
    }
    public DefaultCountingOutRyhmer(IntStackInterface intLinkedList) {
        super();
        this.intLinkedList = intLinkedList;
    }



}
