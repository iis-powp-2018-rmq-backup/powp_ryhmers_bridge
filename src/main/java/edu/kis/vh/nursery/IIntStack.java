package edu.kis.vh.nursery;

public interface IIntStack {

	static final int EMPTY = -1;
	
	void push(int index);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();
}