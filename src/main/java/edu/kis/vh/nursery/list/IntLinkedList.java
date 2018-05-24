package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
	private Node last;
	private int i;

	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return DEFAULT_EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_STACK_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

class Node {

	private final int value;
	protected Node prev;
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

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

