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

}
