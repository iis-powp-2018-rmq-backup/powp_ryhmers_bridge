package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int FIXED_INT = -1;

	private static final int SIZE = 12;

	private int[] numbers = new int[SIZE];

	public int total = FIXED_INT;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == FIXED_INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return FIXED_INT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return FIXED_INT;
		return numbers[total--];
	}

}
