package edu.kis.vh.nursery.collection;

public interface Stack {
	int DEFAULT_EMPTY_STACK_VALUE = 0;
	// using this constant we can change its value only here, and all other "instances" will change too
	
    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}