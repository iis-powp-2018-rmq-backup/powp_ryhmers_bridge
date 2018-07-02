package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.Stack;

public class IntArrayStack implements Stack{

	private static final int FIXED_INT = -1;

	private static final int SIZE = 12;

	private final int[] numbers = new int[SIZE];

	public int total = FIXED_INT;

	public int getTotal() {
		return total;
	}

	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == FIXED_INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return FIXED_INT;
		return numbers[total];
	}

	public int pop() {
		if (isEmpty())
			return FIXED_INT;
		return numbers[total--];
	}

}
