package edu.kis.vh.nursery;

public class IntArrayStack {
	private static final int IS_EMPTY_INDICATOR = -1;

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int total = IS_EMPTY_INDICATOR;

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == IS_EMPTY_INDICATOR;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return IS_EMPTY_INDICATOR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return IS_EMPTY_INDICATOR;
		return numbers[total--];
	}

}
