package edu.kis.vh.nursery.stack;

public interface StackInterface {

	/**
	 * ADD integer to end of list.
	 * @param i - integer to add.
	 */
	void push(int i);

	/**
	 * Check if list is empty.
	 * @return true if list empty otherwise false.
	 */
	boolean isEmpty();

	/**
	 * Check if list is full.
	 * @return should always be false.
	 */
	boolean isFull();

	/**
	 * Get value from top of the list.  
	 * @return integer that is currently on the top of the list
	 */
	int top();

	/**
	 * Pop out value from top of the list. 
	 * @return true if list empty otherwise false.
	 */
	int pop();

	/**
	 * @return list size.
	 */
	int getSize();

}