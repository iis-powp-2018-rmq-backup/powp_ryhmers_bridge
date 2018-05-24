package edu.kis.vh.nursery.list;

public interface StackInterface {

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