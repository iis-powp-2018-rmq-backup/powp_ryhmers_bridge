package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class DefaultCountingOutRyhmer {

    // klasa wykorzystujac wspolny interjejs moze korzystac teraz z IntArrayStack lub IntLinkedList

    //Wszystkie klasy Ryhmers lamia ta zasade, brak im wspolnego interfejsu.

    public DefaultCountingOutRyhmer(IntLinkedListInterface IntLinkedList) {
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

    private IntLinkedListInterface IntLinkedList;

}
