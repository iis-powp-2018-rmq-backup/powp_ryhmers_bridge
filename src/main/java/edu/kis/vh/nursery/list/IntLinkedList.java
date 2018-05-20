package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int VALUE_IF_EMPTY = -1;
	private Node last;

	protected void push(final int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	protected boolean isEmpty() {
		return last == null;
	}

	protected boolean isFull() {
		return false;
	}

	protected int top() {
		if (isEmpty()) {
			return VALUE_IF_EMPTY;
		}
		return last.getValue();
	}

	protected int pop() {
		if (isEmpty()) {
			return VALUE_IF_EMPTY;
		}
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

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
