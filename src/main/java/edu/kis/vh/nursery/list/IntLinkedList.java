package edu.kis.vh.nursery.list;

/**
 * Basic implementation of linked list contained integers.
 */

public class IntLinkedList implements StackInterface {
	
	private Node last;
	
	/**
	* Amount of elements in list
	*/
	private int size = 0;
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
			size++;
		}
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
			size++;
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return false; // TODO: In this case, this method is useless, should be removed. 
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}
	
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		final int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}
	
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#getSize()
	 */
	@Override
	public int getSize() {
		return size;
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


