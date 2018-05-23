package edu.kis.vh.nursery.stack;


public class IntLinkedList implements Stack {

	private Node last;
	private int total = Stack.IS_EMPTY_INDICATOR;

	@Override
	public void push(final int i) {
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
			return Stack.IS_EMPTY_INDICATOR;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return Stack.IS_EMPTY_INDICATOR;
		final int ret = last.getValue();
		last = last.getPrev();
		--total;
		return ret;
	}

	@Override
	public int getTotal() {
		return total;
	}


	
	

}

class Node {

	private final int value;  //pozostałe klasy zamiast odwoływac się bezpośrednio do pola, korzystają z getterów i setteró
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

