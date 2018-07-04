package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public interface IntContainer {

    void countIn(int in);

    int countOut();

    int peekaboo();

    boolean callCheck();

    boolean isFull();

}
