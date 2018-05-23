package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack{
	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int total = Stack.IS_EMPTY_INDICATOR;

	public int getTotal() {
		return total;
	}

	public void push(final int in) {
		if (!isFull())
			numbers[total++] = in;
	}

	public boolean isEmpty() {
		return total == Stack.IS_EMPTY_INDICATOR;
	}

	public boolean isFull() {
		return total == CAPACITY;
	}

	public int top() {
		if (isEmpty())
			return Stack.IS_EMPTY_INDICATOR;
		return numbers[total];
	}

	public int pop() {
		if (isEmpty())
			return Stack.IS_EMPTY_INDICATOR;
		return numbers[--total];
	}

}
