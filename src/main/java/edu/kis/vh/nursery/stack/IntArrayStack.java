package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack {

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	public int total = EMPTYSTACK;

	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTYSTACK;
	}

	public boolean isFull() {
		return total == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTYSTACK;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTYSTACK;
		return numbers[total--];
	}
}
