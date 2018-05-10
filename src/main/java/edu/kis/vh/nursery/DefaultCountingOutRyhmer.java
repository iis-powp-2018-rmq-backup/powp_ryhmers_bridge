package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int NUMBERS_CAPACITY = 12;

	private static final int LOWEST = -1;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	public int total = LOWEST;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == LOWEST;
	}

	public boolean isFull() {
		return total == NUMBERS_CAPACITY - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return LOWEST;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return LOWEST;
		return numbers[total--];
	}

}
