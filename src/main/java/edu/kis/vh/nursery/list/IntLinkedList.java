package edu.kis.vh.nursery.list;

public class IntLinkedList implements Stack{

	private static final int isEmptyInt = -1;
	private Node last;
	private int total = isEmptyInt;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		++total;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return isEmptyInt;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return isEmptyInt;
		int ret = last.getValue();
		last = last.getPrev();
		--total;
		return ret;
	}

	@Override
	public int getTotal() {
		return total;
	}

	class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(final int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(final Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(final Node next) {
			this.next = next;
		}
		
	}
	
}
