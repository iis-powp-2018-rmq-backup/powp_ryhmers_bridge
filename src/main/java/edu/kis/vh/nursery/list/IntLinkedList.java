package edu.kis.vh.nursery.list;

/**
 * Class providing operations on the list of nodes
 */
public class IntLinkedList {

	/**
	 * Default value returned by methods when the list is empty
	 */
	private static final int DEFAULT_EMPTY_LIST_VALUE = -1;
	/**
	 * Last element of the list
	 */
	private Node last;

	/**
	 * Pushes value as a last element of the list
	 * @param i Value to push
	 */
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Checks if the list is empty
	 * @return TRUE if list is empty
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Checks if the list is full
	 * @return FALSE since list does not have fixed capacity
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns last value of the list
	 * @return Last value of the list if list is not empty. Otherwise, DEFAULT_EMPTY_LIST_VALUE is returned.
	 */
	public int top() {
		if (isEmpty())
			return DEFAULT_EMPTY_LIST_VALUE;
		return last.getValue();
	}

	/**
	 * Returns last value of the list and removes it
	 * @return Last value of the list if list is not empty. Otherwise, DEFAULT_EMPTY_LIST_VALUE is returned.
	 */
	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_LIST_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	/**
	 * Class being container of value and references to neighboring nodes. Single element of the list.
	 */
	 class Node {

		/**
		 * Value of node
		 */
        private int value;

		/**
		 * Reference to previous node
		 */
		private Node prev;

		/**
		 * Reference to next node
		 */
        private Node next;

		/**
		 * Constructor
		 * @param i Value of node
		 */
		Node(final int i) {
            value = i;
        }

        //Automatic encapsulation caused IntLinkedList class' methods to use getters and setters generated below.

		/**
		 * Getter of node's value
		 * @return Value
		 */
        public int getValue() {
            return value;
        }

		/**
		 * Getter of previous node
		 * @return Previous node
		 */
		public Node getPrev() {
            return prev;
        }

		/**
		 * Setter of previous node
		 * @param prev Previous node
		 */
		public void setPrev(final Node prev) {
            this.prev = prev;
        }

		/**
		 * Getter of next node
		 * @return Next node
		 */
        public Node getNext() {
            return next;
        }

		/**
		 * Setter of next node
		 * @param next Next node
		 */
        public void setNext(final Node next) {
            this.next = next;
        }
    }

}
