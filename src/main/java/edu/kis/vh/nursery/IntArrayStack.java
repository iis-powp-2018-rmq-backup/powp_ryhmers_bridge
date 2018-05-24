package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.StackInterface;

public class IntArrayStack implements StackInterface{

	private static final int DEFAULT_ARRAY_EMPTY_VALUE = -1;

	private static final int NUMBERS_CAPACITY = 12;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = DEFAULT_ARRAY_EMPTY_VALUE;

	@Override
	public int getSize() {
		return total;
	}

	@Override
	public void push(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == DEFAULT_ARRAY_EMPTY_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == NUMBERS_CAPACITY + DEFAULT_ARRAY_EMPTY_VALUE;
	}

	@Override
	public int top() {
		if (isEmpty())
			return DEFAULT_ARRAY_EMPTY_VALUE;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return DEFAULT_ARRAY_EMPTY_VALUE;
		return numbers[total--];
	}
}
