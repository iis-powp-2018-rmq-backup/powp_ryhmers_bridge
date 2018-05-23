package edu.kis.vh.nursery.stack;

public interface Stack {

	int IS_EMPTY_INDICATOR = 0; //tak ułatwiła gdyż wystarczy, że zmieniłem tylko jedne pole zamiast dwóch

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}