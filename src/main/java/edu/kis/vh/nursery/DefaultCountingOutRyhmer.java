package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int EMPTY_ARRAY = -1;

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int total = EMPTY_ARRAY;

	public int getTotal() {
		return total;
	}

	/**
	 * @param in any number
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ARRAY;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total--];
	}
/*
 * alt + left arrow = move back to previously modified file 
 * alt + right arrow = move forward to lately modified file
 */

}
