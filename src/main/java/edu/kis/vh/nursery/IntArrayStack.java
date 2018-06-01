package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int NUMBERS_CAPACITY = 12;

	private static final int ARRAY_EMPTY = -1;

	private int[] NUMBERS = new int[NUMBERS_CAPACITY];

	private int total = ARRAY_EMPTY;

	public int getTotal() {
		return total;
	}


	protected void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == ARRAY_EMPTY;
	}

	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total];
	}

	protected int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total--];
	}

}
