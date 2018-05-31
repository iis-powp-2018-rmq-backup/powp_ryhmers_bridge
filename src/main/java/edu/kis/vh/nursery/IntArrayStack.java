package edu.kis.vh.nursery;

public class IntArrayStack {
	public final static int MAX_NUMBERS_COUNT = 12;
	public final static int NO_NUMBERS = -1;

	private final int[] numbers = new int[MAX_NUMBERS_COUNT];

	private int total = NO_NUMBERS;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == NO_NUMBERS;
	}

	public boolean isFull() {
		return total == MAX_NUMBERS_COUNT - 1;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return NO_NUMBERS;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return NO_NUMBERS;
		}
		return numbers[total--];
	}
}
