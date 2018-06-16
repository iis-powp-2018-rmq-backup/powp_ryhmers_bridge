package edu.kis.vh.nursery.stack;

import lombok.Getter;
import lombok.Setter;

class Node {

    @Getter
    private int value;

    @Getter
    @Setter
    private Node prev, next;

    public Node(final int input) {
        value = input;
    }

}