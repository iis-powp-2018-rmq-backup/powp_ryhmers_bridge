package edu.kis.vh.nursery.list;

class Node {

    int value;
    Node next;
    Node prev;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

	Node(int i) {
		value = i;
	}

}
