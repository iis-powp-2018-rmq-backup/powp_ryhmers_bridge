package edu.kis.vh.nursery.collections;

public class IntLinkedList implements CountingContainer {

	private int total = LIST_EMPTY;
	private Node last;

	@Override public void push(int value) {
		if (getLast() == null)
			setLast(new Node(value));
		else {
			getLast().setNext(new Node(value));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
		total++;
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	@Override public int top() {
		if (isEmpty())
			return LIST_EMPTY;
		return getLast().getValue();
	}

	@Override public int pop() {
		if (isEmpty())
			return LIST_EMPTY;
		int returnedValue = getLast().getValue();
		setLast(getLast().getPrev());
		return returnedValue;
	}

	@Override
	public int getTotal() {
		return total;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	/*
	dostęp do obiektu Node oraz zmiennej last jest teraz możliwy wyłącznie poprzez gettery i settery
	 */
}

class Node {

	private final int value;
	private Node prev;
	private Node next;

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
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

	/*
	dostęp do obiektów Node jest teraz możliwy wyłącznie poprzez gettery i settery
	 */
}

