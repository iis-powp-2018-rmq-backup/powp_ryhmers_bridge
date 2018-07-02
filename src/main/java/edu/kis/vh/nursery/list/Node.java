package edu.kis.vh.nursery.list;

public class Node {

	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}
	
}

// Alt + arrows left and right, skips whole words, instead of letters (at least on Mac)
// Alt + arrows up and down, moves whole line up and down (or selection)