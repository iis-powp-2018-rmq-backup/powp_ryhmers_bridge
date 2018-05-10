package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int NUMBERS_CAPACITY = 12;

	private static final int LOWEST = -1;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = LOWEST;

	
	public int getTotal() {
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == LOWEST;
	}

	protected boolean isFull() {
		return total == NUMBERS_CAPACITY - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return LOWEST;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return LOWEST;
		return numbers[total--];
	}

}
