package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static int NUMBERS_CAPACITY = 12;

	private static int STARTING_CAPACITY = -1;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	public int total = STARTING_CAPACITY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STARTING_CAPACITY;
	}

	public boolean isFull() {
		return total == NUMBERS_CAPACITY - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
