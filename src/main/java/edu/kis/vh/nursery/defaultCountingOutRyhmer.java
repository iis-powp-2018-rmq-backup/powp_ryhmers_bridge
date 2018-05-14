package edu.kis.vh.nursery;

public class defaultCountingOutRyhmer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}
/*
 * alt + left arrow = move back to previously modified file 
 * alt + right arrow = move forward to lately modified file
 */

}
