package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int LIST_EMPTY = -1;
	private Node last;
	private int value;

	public void push(int value) {
		if (getLast() == null)
			setLast(new Node(value));
		else {
			getLast().setNext(new Node(value));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return LIST_EMPTY;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return LIST_EMPTY;
		int returnedValue = getLast().getValue();
		setLast(getLast().getPrev());
		return returnedValue;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/*
	dostęp do obiektu Node oraz zmiennej last jest teraz możliwy wyłącznie poprzez gettery i settery
	 */
}
