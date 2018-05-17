package edu.kis.vh.nursery.list;

/**
 * Class represents stack as linked list which contains integer values,
 * along with functionalities to handle the list.
 * @author Piotr
 *
 */
public class IntLinkedList {

	/**
	 * Constant Value, which represents empty list
	 */
	private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
	/**
	 * Last element of list
	 */
	private Node last;
	/**
	 * Amount of elements in list
	 */
	private int size=0;

	/**
	 * Method adds value to the list
	 * @param i value which be added to list
	 */
	public void push(final int i) {
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

	/**
	 * Method checks, if the list is empty
	 * @return boolean value whether list is empty or not
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Method checks, if the list is full
	 * @return boolean value whether list is full or not
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Method gives the value of the last added element
	 * @return integer value of the last added element
	 */
	public int top() {
		if (isEmpty())
			return DEFAULT_EMPTY_STACK_VALUE;
		return last.getValue();
	}

	/**
	 * Method gives the value of the last added element and remove it from list
	 * @return integer value of the last added element or the constant value, if the list is empty
	 */
	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_STACK_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}
	
	public int getSize() {
		return size;
	}

	/**
	 * Getter of Last atribute
	 * @return last added node
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Setter of Last atribute
	 * @param last added node
	 */
	public void setLast(Node last) {
		this.last = last;
	}

}

class Node {

	/**
	 * Value which contains node
	 */
	private final int value;
	/**
	 * Reference to neigbours of current node
	 */
	private Node prev, next;

	/**
	 * Constructor
	 * @param i value which will contain node
	 */
	public Node(final int i) {
		value = i;
	}

	/**
	 * Getter of the value atribute
	 * @return node value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Getter of the node prev atribute
	 * @return previous node to current node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Setter of the node prev atribute
	 * @param prev previous node to current node
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * Getter of the node next atribute
	 * @return next node to current node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Setter of the node next atribute
	 * @param next node to current node
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
