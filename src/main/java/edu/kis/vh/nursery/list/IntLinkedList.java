package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int DEFAULT_EMPTY_LIST_VALUE = -1;
	private Node last;
	private int i;

	public void push(final int i) {
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
			return DEFAULT_EMPTY_LIST_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_LIST_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public class Node {

        private int value;
        private Node prev;
        private Node next;

        Node(final int i) {
            value = i;
        }

        //Automatic encapsulation caused IntLinkedList class' methods to use getters and setters generated below.

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
