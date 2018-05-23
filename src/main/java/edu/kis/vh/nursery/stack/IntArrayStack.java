package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack{
	private static final int IS_EMPTY_INDICATOR = -1;

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int total = IS_EMPTY_INDICATOR;

	public int getTotal() {
		return total;
	}

	public void push(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == IS_EMPTY_INDICATOR;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	public int top() {
		if (isEmpty())
			return IS_EMPTY_INDICATOR;
		return numbers[total];
	}

	public int pop() {
		if (isEmpty())
			return IS_EMPTY_INDICATOR;
		return numbers[total--];
	}

}
