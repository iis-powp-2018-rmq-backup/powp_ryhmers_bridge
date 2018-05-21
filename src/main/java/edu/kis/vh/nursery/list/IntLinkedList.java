package edu.kis.vh.nursery.list;

/**
 * Basic implementation of linked list contained integers.
 */

public class IntLinkedList {
	
	private Node last;


	/**
	 * ADD integer to end of list.
	 * @param i - integer to add.
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
	 * Check if list is empty.
	 * @return true if list empty otherwise false.
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Check if list is full.
	 * @return should always be false.
	 */
	public boolean isFull() {
		return false; // TODO: In this case, this method is useless, should be removed. 
	}

	/**
	 * Get value from top of the list.  
	 * @return integer that is currently on the top of the list
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}
	
	
	/**
	 * Pop out value from top of the list. 
	 * @return true if list empty otherwise false.
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		Node(int i) {
			value = i;
		}

		int getValue() {
			return value;
		}

		void setValue(int value) {
			this.value = value;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(Node prev) {
			this.prev = prev;
		}

	}

}


