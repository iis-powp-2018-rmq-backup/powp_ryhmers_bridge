package edu.kis.vh.nursery.stack;

public interface IntStackInterface {
	
	final int DEFAULT_EMPTY_STACK_VALUE = -1;
	
	void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
