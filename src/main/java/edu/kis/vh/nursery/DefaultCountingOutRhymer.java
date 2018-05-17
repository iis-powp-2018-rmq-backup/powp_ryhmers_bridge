package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	static final int EMPTY = -1;
	static final int NUMBER_CAPACITY = 12;
	static final int FULL = 11;

	private int[] NUMBERS = new int[NUMBER_CAPACITY];
	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total];
	}

	protected int countOut() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total--];
	}

}
