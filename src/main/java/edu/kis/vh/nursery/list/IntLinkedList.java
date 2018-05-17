package edu.kis.vh.nursery.list;

public class IntLinkedList {
	public static final int LIST_EMPTY = -1;

	private Node last;
	private int i;

	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
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
		if (isEmpty()) {
			return LIST_EMPTY;
		}
		return last.getValue();
	}

	public int pop() {
		if (isEmpty()) {
			return LIST_EMPTY;
		}
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	private class Node {

		// W klasie IntLinkedList bezpośrednie referencje do pól zostały zamienione na gettery i settery.
		// Zad. 9 - w całym projekcie nie ma nieużywanych setterów
		private int value;
		private Node prev;
		private Node next;

		Node(int i) {
			setValue(i);
		}

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
	}
}
