package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	static final int EMPTY = -1;
	static final int FULL = 12;

	private int[] NUMBERS = new int[FULL];

	public int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total--];
	}

}
