package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_CAPACITY = 12;

	private static final int ARRAY_EMPTY = -1;

	private int[] NUMBERS = new int[NUMBERS_CAPACITY];

	public int total = ARRAY_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == ARRAY_EMPTY;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total--];
	}

}
