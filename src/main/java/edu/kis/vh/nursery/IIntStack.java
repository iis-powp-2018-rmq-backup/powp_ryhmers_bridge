package edu.kis.vh.nursery;

public interface IIntStack {

	void push(int index);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();
}