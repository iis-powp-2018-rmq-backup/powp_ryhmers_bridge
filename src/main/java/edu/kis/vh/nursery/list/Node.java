package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    public Node prev, next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
