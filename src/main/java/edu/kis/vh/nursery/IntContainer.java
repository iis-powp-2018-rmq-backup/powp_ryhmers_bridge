package edu.kis.vh.nursery;

public interface IntContainer {

    static final int empty = -1;

    void countIn(int in);

    int countOut();

    int peekaboo();

    boolean callCheck();

    boolean isFull();

}
