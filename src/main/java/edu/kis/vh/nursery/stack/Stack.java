package edu.kis.vh.nursery.stack;

public interface Stack {

	int isEmptyIndicator = 0; //Yes it made it easier, because instead of changing the same int in 2 classes, I can change it in only one to achieve the same effect, and easier
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}