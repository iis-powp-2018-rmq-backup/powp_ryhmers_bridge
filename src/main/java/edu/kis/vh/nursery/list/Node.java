package edu.kis.vh.nursery.list;

class Node {

    int value; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node prev; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node next; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    //
    Node(int i) {
        setValue(i);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
