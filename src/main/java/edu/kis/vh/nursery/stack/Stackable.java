package edu.kis.vh.nursery.stack;

public interface Stackable {

	int IS_EMPTY = 0;
	/*Tak, realizacja zadania 10 sprawiła, że wystarczyło zmienić 
	 * wartość jednej zmiennej.
	 */

	int getSize();

	/**
	 * @param in any number
	 */
	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
	/*
	 * alt + left arrow = move back to previously modified file 
	 * alt + right arrow = move forward to lately modified file
	 */

}