package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IIntStack;

public class IntArrayStack implements IIntStack {

	static final int NUMBER_CAPACITY = 12;
	static final int FULL = 11;

	private final int[] NUMBERS = new int[NUMBER_CAPACITY];
	private int total = EMPTY;
	
	public int getTotal() {
		return total;
	}

	public void push(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean isEmpty() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == FULL;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return NUMBERS[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		return NUMBERS[total--];
	}

}
