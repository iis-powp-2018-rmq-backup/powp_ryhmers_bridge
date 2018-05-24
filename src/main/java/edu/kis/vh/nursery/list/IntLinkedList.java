package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int initialtotal = -1;

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
			return initialtotal;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return initialtotal;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public int getI() {
		return i;
	}

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		// Enkapsulacja tworzy w tym wypadku get/set oraz ustawia pola na private,
		// dzięki getterom i setterom które automatycznie są zastepywane
		// przez getNext etc. zmienne nie muszą być public
		private Node(int i) {
			value = i;
		}

		private int getValue() {
			return value;
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
