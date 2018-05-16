package edu.kis.vh.nursery.list;

public class IntLinkedList {


	public static final int EMPTY_LIST = -1;
	private Node last;
	int i;

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
			return EMPTY_LIST;
		}
		return last.getValue();
	}

	public int pop() {
		if (isEmpty()) {
			return EMPTY_LIST;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
