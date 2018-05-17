package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		Node(final int i) {
			setValue(i);
		}

		int getValue() {
			return value;
		}

		void setValue(int value) {
			this.value = value;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(final Node prev) {
			this.prev = prev;
		}

		Node getNext() {
			return next;
		}

		void setNext(final Node next) {
			this.next = next;
		}
	}

	private Node last;
	private int i;

	public void push(final int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
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
			return -1;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		final int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}


	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}
	int getI() {
		return i;
	}


}


