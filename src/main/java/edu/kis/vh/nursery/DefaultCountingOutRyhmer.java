package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int ARRAY_EMPTY = -1;

	private static final int NUMBER_OF_NUMBERS = 12;

	private int[] numbers = new int[NUMBER_OF_NUMBERS];

	public int total = ARRAY_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
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
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return numbers[total--];
	}

}
