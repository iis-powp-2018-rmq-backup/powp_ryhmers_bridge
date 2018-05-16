package edu.kis.vh.nursery.list;

/**
 * This class provides interface for linked list which contains only integers
 */
public class IntLinkedList {

	/**
	 * This constant is used to check if list is empty
	 */
	public static final int EMPTY_LIST = -1;
	/**
	 * Single element on the list
	 */
	private Node last;
	private int i;

	/**
	 * Method adds new value to the list
	 * @param i this value is placed in list
	 */
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * This method checks if list is empty
	 * @return boolean This returns if list is empty
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * This method checks if list is full
	 * @return boolean This returns if list is full
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * This method returns last value from list
	 * @return int This returns last value from list or EMPTY_LIST if list is empty
	 */
	public int top() {
		if (isEmpty()) {
			return EMPTY_LIST;
		}
		return last.value;
	}

	/**
	 * This method removes and returns last value from the list
	 * @return int Last value from the list
	 */
	public int pop() {
		if (isEmpty()) {
			return EMPTY_LIST;
		}
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	/**
	 * Nested class which is used as single element on the list
	 */
	class Node {

		int value;
		Node prev, next;

		/**
		 *
		 * @param i int Value of the Node
		 */
		Node(int i) {
			value = i;
		}

	}

}
