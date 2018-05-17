package edu.kis.vh.nursery.collections;

/**
 * @author ola List for handling int values
 */
public class IntLinkedList {

	private static final int EMPTY_VALUE = -1;
	private Node last;

	/**
	 * Insert value to the list
	 * 
	 * @param i
	 *            value pushed to the list
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Check if list is empty
	 * 
	 * @return true if empty list, otherwise false
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Unlimited size, always true
	 * 
	 * @return always true
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * return last added value
	 * 
	 * @return int value from top
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_VALUE;
		return last.getValue();
	}

	/**
	 * retun last added value and remove from list
	 * 
	 * @return last added value
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

/**
 * represetation of single node for storing int value
 * 
 * @author ola
 *
 */
class Node {
	// dla poniższych pol refactor spowodował utworzenie setterow/getterów i ic
	// automatyczne użucie w miejscu bezposredniego
	// odwolania do pol
	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

}
