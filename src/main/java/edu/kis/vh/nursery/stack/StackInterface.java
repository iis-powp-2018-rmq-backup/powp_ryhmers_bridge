package edu.kis.vh.nursery.stack;

public interface StackInterface {

	/**
	 * Constant Value, which represents empty list
	 */
	int DEFAULT_EMPTY_STACK_VALUE = 0;
//	Change from 3.1.10, helps me, because i had to only change one line of code.
	/**
	 * Method adds value to the list
	 * @param i value which be added to list
	 */
	void push(int i);

	/**
	 * Method checks, if the list is empty
	 * @return boolean value whether list is empty or not
	 */
	boolean isEmpty();

	/**
	 * Method checks, if the list is full
	 * @return boolean value whether list is full or not
	 */
	boolean isFull();

	/**
	 * Method gives the value of the last added element
	 * @return integer value of the last added element
	 */
	int top();

	/**
	 * Method gives the value of the last added element and remove it from list
	 * @return integer value of the last added element or the constant value, if the list is empty
	 */
	int pop();

	int getSize();

}