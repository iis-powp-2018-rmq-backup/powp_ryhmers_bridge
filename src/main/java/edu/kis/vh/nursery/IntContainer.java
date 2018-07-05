package edu.kis.vh.nursery;

public interface IntContainer {

    static final int empty = 0;

    // zmiana wymagana tylko w jednym miejscu

    void countIn(int in);

    int countOut();

    int peekaboo();

    boolean callCheck();

    boolean isFull();

}
