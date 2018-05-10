package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	public static final int NUMBERS_CAPACITY = 12;
	public static final int NO_NUMBERS = -1;
	private int[] numbers = new int[NUMBERS_CAPACITY];

	public int total = NO_NUMBERS;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == NO_NUMBERS;
	}

	public boolean isFull() {
		return total == NUMBERS_CAPACITY - 1;
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
