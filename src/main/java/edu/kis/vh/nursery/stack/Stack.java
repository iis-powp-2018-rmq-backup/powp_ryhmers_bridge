package edu.kis.vh.nursery.stack;

public interface Stack {

	int FIXED_INT = -1;
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}