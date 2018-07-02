package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int FIXED_INT = -1;

	private static final int SIZE = 12;

	private final int[] numbers = new int[SIZE];

	public int total = FIXED_INT;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == FIXED_INT;
	}

	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return FIXED_INT;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return FIXED_INT;
		return numbers[total--];
	}

}
