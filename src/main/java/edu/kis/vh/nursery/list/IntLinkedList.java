package edu.kis.vh.nursery.list;

public class IntLinkedList {

	static final int EMPTY = -1;
	
	private Node last;
	private int index;

	public void push(int index) {
		if (getLast() == null)
			setLast(new Node(index));
		else {
			getLast().setNext(new Node(index));
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
			return EMPTY;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}

	int getIndex() {
		return index;
	}

	void setIndex(int index) {
		this.index = index;
	}

}
