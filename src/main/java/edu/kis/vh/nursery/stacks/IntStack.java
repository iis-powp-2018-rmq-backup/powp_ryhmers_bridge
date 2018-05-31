package edu.kis.vh.nursery.stacks;

public interface IntStack {
		int EMPTY_STACK = -1;
		void push(int i);
		boolean isEmpty();
		boolean isFull();
		int top();
		int pop();
	}

