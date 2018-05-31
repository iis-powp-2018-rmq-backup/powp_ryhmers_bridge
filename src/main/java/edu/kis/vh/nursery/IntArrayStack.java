package edu.kis.vh.nursery;

public class IntArrayStack implements IntStack {
	public final static int MAX_NUMBERS_COUNT = 12;
	public final static int NO_NUMBERS = -1;

	private final int[] numbers = new int[MAX_NUMBERS_COUNT];

	private int total = NO_NUMBERS;

	public int getTotal() {
		return total;
	}

	@Override
	public void push(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	@Override
	public boolean isEmpty() {
		return total == NO_NUMBERS;
	}

	@Override
	public boolean isFull() {
		return total == MAX_NUMBERS_COUNT - 1;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return NO_NUMBERS;
		}
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return NO_NUMBERS;
		}
		return numbers[total--];
	}
}
