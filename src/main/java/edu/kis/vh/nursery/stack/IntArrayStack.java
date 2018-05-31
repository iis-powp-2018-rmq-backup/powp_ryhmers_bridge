package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack {
	public final static int MAX_NUMBERS_COUNT = 12;

	private final int[] numbers = new int[MAX_NUMBERS_COUNT];

	private int total = STACK_EMPTY;

	public int getTotal() {
		return total;
	}

	@Override
	public void push(int in) {
		if (!isFull()) {
			numbers[total++] = in;
		}
	}

	@Override
	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	@Override
	public boolean isFull() {
		return total == MAX_NUMBERS_COUNT;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return STACK_EMPTY;
		}
		return numbers[total--];
	}
}
