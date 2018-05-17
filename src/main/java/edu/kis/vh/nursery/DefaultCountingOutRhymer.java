package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STARTINGTOTAL = -1;

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	private int total = STARTINGTOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STARTINGTOTAL;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return STARTINGTOTAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STARTINGTOTAL;
		return numbers[total--];
	}

}
