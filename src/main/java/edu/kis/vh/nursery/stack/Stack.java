package edu.kis.vh.nursery.stack;

public interface Stack {

	int IS_EMPTY_INDICATOR = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}