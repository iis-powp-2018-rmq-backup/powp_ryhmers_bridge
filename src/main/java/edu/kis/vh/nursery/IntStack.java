package edu.kis.vh.nursery;

public interface IntStack {
	void push(int i);
	boolean isEmpty();
	boolean isFull();
	int top();
	int pop();
}
