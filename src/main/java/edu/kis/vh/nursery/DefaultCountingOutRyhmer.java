package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int DEFAULT_ARRAY_FULL_VALUE = 11;

	private static final int DEFAULT_ARRAY_EMPTY_VALUE = -1;

	private static final int NUMBERS_CAPACITY = 12;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	public int total = DEFAULT_ARRAY_EMPTY_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT_ARRAY_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == DEFAULT_ARRAY_FULL_VALUE;
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
