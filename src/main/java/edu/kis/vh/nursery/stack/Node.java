package edu.kis.vh.nursery.stack;

class Node {

    public final int value;
    public Node next;
    public Node prev;

    int getValue() {
        return value;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

	Node(int i) {
		value = i;
	}

}
