package edu.kis.vh.nursery.list;

public class Node {

	private final int value;
	protected Node prev;
	private Node next;

	public Node(final int i) {
		value = i;
	}

	protected int getValue() {
		return value;
	}

	

	protected Node getNext() {
		return next;
	}

	protected void setNext(Node next) {
		this.next = next;
	}

}
