package edu.kis.vh.nursery.stack;

/**
 * LinkedList to store ints.
 */
public class IntLinkedList implements IntStackInterface {
	private Node last;

	private int size;

	/**
	 * Gets size of list
	 * @return size of list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Pushes value to the top of the stack
	 * @param i value to be added
	 */
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		size++;
	}

	/**
	 * Checks if stack is empty
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Checks if stack is full
	 * @return false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns value at the top
	 * @return int value on the top
	 */
	public int top() {
		if (isEmpty())
			return IS_EMPTY;
		return last.getValue();
	}

	/**
	 * Pops value from the top
	 * @return int value from the top
	 */
	public int pop() {
		if (isEmpty())
			return IS_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}

}

class Node {

	private int value;
	private Node prev;
	private Node next;
	//changes in IntLinkedList: getters and setters used instead

	Node(final int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
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
}