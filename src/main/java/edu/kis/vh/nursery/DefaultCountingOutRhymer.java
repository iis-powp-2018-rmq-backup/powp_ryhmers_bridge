package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_EMPTY = -1;
	private static final int NUMBERS_CAPACITY = 12;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = NUMBERS_EMPTY;

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == NUMBERS_EMPTY;
	}
	
	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return NUMBERS_EMPTY;
		return numbers[total];
	}
		
	protected int countOut() {
		if (callCheck())
			return NUMBERS_EMPTY;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}