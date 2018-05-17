package edu.kis.vh.nursery.list;

 /**
 * Class represents stack as linked list of int values and methods to work with it
 * @author Cezary Witkowski
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
    Node last;
    
    /**
	 * Method that adds value to the list
	 * @param i value which will be added to list
	 */
    public void push(final int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
	 * Method checks, if the list is empty
	 * @return boolean value true or false
	 */
    public boolean isEmpty() {
        return last == null;
    }

    /**
	 * Method checks, if the list is full
	 * @return boolean value true or false
	 */
    public boolean isFull() {
        return false;
    }

    /**
	 * Method returns the value of the last added element
	 * @return integer value of the last added element
	 */
    public int top() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    /**
	 * Method returns the value of the last added element and removes it from list
	 * @return integer value of the last added element or the constant value, if case of empty list
	 */
    public int pop() {
        if (isEmpty()) {
            return DEFAULT_EMPTY_STACK_VALUE;
        }
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
    
    public class Node {

    	/**
    	 * Value of node
    	 */
        private final int value;
        /**
    	 * Reference to previous and next node on the list
    	 */
        private Node prev, next;
        /**
    	 * Constructor
    	 * @param i value of the node
    	 */
        public Node(final int i) {
            value = i;
        }
        /**
    	 * Getter of the value
    	 * @return node value
    	 */
        public int getValue() {
            return value;
        }
        /**
    	 * Getter of the previous node
    	 * @return previous node
    	 */
        public Node getPrev() {
            return prev;
        }
        /**
    	 * Setter of the previous node
    	 * @param prev previous node
    	 */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
        /**
    	 * Getter of the next node
    	 * @return next node
    	 */
        public Node getNext() {
            return next;
        }
        /**
    	 * Setter of the next node
    	 * @param next node
    	 */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
