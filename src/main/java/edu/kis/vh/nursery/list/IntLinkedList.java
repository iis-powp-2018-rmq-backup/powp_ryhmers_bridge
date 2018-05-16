package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
	
	private Node last;
	private int i;

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
			return DEFAULT_EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_STACK_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	Node getLast() {
		return last;
	}

	int getI() {
		return i;
	}
	
	private class Node {

		// metody top i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
		private int value;
		// metody push i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
		private Node prev;
		// metoda push klasy IntLinkedList używa settera i gettera zamiast bezpośredniego dostępu do pola
		private Node next;

		private Node(int i) {
			value = i;
		}
		// alt + <- poprzednio edytowana klasa  alt + -> następna klasa

		private int getValue() {
			return value;
		}

		private void setValue(int value) {
			this.value = value;
		}

		private Node getPrev() {
			return prev;
		}

		private void setPrev(Node prev) {
			this.prev = prev;
		}

		private Node getNext() {
			return next;
		}

		private void setNext(Node next) {
			this.next = next;
		}
	}
}
