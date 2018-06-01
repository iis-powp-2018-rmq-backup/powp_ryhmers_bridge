package edu.kis.vh.nursery.collection;

public class IntArrayStack implements Stack {

	private static final int NUMBERS_CAPACITY = 12;
	private static final int ARRAY_EMPTY = -1;
	private int[] NUMBERS = new int[NUMBERS_CAPACITY];
	private int total = ARRAY_EMPTY;
	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void push(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}
	@Override
	public boolean isEmpty() {
		return total == ARRAY_EMPTY;
	}
	@Override
	public boolean isFull() {
		return total == 11;
	}
	@Override
	public int top() {
		if (isEmpty())
			return ARRAY_EMPTY;
		return NUMBERS[total];
	}
	@Override
	public int pop() {
		if (isEmpty())
			return ARRAY_EMPTY;
		return NUMBERS[total--];
	}

}
