package edu.kis.vh.nursery.list;

/**
 * @author Monia 
 * Class with linked list that contains only integers.
 */
public class IntLinkedList {

	/**
	 * Constant value to indicate when the list is empty.
	 */
	private static final int VALUE_IF_EMPTY = -1;
	/**
	 * Last element of the list.
	 */
	private Node last;

	/**
	 * This method pushes value to the top of the list.
	 * 
	 * @param i
	 *            - value to be placed into the list.
	 */
	protected void push(final int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * This method check if the list is empty.
	 * 
	 * @return returns true if empty, false if not.
	 */
	protected boolean isEmpty() {
		return last == null;
	}

	/**
	 * This method check if the list is full.
	 * 
	 * @return returns false if is full.
	 */
	protected boolean isFull() {
		return false;
	}

	/**
	 * This method returns last value from list.
	 * 
	 * @return returns last value from list if not empty and VALUE_IF_EMPTY when
	 *         empty.
	 */
	protected int top() {
		if (isEmpty()) {
			return VALUE_IF_EMPTY;
		}
		return last.getValue();
	}

	/**
	 * This method removes last value from the list.
	 * 
	 * @return returns last value from the list.
	 */
	protected int pop() {
		if (isEmpty()) {
			return VALUE_IF_EMPTY;
		}
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	/**
	 * @author Monia Nested class which is used as single element on the list.
	 */
	private class Node {

		private final int value;
		private Node prev;
		private Node next;

		/*
		 * Powstały gettery i settery do wartości value, prev oraz next. W klasie
		 * IntLinkedList zmieniło się na: last.next =new Node(i); => last.setNext(new
		 * Node(i)); last.next.prev = last; => last.getNext().setPrev(last); last =
		 * last.next; => last = last.getNext();
		 */
		protected Node(final int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(final Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(final Node prev) {
			this.prev = prev;
		}

	}

}
