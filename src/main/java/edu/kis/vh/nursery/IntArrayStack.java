package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int DEFAULT_ARRAY_EMPTY_VALUE = -1;

	private static final int NUMBERS_CAPACITY = 12;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = DEFAULT_ARRAY_EMPTY_VALUE;

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT_ARRAY_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == NUMBERS_CAPACITY + DEFAULT_ARRAY_EMPTY_VALUE;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_ARRAY_EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_ARRAY_EMPTY_VALUE;
		return numbers[total--];
	}
}
