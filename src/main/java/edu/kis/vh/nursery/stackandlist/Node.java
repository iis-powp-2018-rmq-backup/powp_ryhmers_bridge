package edu.kis.vh.nursery.stackandlist;

public class Node {

    private final int value;
    public Node prev, next;

    public Node(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
