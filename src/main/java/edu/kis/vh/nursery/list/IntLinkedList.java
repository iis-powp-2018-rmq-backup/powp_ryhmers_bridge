package edu.kis.vh.nursery.list;

public class IntLinkedList {

	static final int EMPTY = -1;
	
	class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
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
		
		/*
		 * W innych klasach ustawianie wartosci zostalo zamienione na uzycie settera a pobieranie na uzycie gettera
		 */
	}

	private Node last;
	private int total = 0;

	public void push(int index) {
		if (last == null)
			last = new Node(index);
		else {
			last.setNext(new Node(index));
			last.getNext().setPrev(last);
			last = last.getNext();
			total++;
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
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		total --;
		return ret;
	}

	public int getTotal() {
		return total;
	}
}
