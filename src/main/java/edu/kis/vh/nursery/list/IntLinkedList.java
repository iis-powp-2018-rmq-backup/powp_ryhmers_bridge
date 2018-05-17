package edu.kis.vh.nursery.list;

/**
 * Basic implementation of linked list that contains integers.
 */
public class IntLinkedList {
	/**
	 * Value returned by empty list.
	 */
	public static final int LIST_EMPTY = -1;

	private Node last;
	private int i;

	/**
	 * Add integer to end of list.
	 * @param i - integer to add
	 */
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Check if list is empty.
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Check if list is full.
	 * @return should always return false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Get value on top of list.
	 * @return integer that is currently on top of the list
	 */
	public int top() {
		if (isEmpty()) {
			return LIST_EMPTY;
		}
		return last.getValue();
	}

	/**
	 * Pop out value from top of the list.
	 * @return popped out value
	 */
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
