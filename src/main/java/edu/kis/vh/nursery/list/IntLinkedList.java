package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int IS_EMPTY_INDICATOR = -1;
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
			return IS_EMPTY_INDICATOR;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return IS_EMPTY_INDICATOR;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

class Node {

	private final int value;  //pozostałe klasy zamiast odwoływac się bezpośrednio do pola, korzystają z getterów i setteró
	private Node prev;
	private Node next;

	public Node(final int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(final Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(final Node next) {
		this.next = next;
	}
	
}

