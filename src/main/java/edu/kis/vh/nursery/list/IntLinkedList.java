package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	

	public void push(int i) {
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
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		Node(int i) {
			value = i;
		}

		int getValue() {
			return value;
		}

		void setValue(int value) {
			this.value = value;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(Node prev) {
			this.prev = prev;
		}

	}

}


