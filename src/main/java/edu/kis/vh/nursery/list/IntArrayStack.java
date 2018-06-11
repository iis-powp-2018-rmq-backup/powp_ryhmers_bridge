package edu.kis.vh.nursery.list;

public class IntArrayStack {
	private static final int INITIALTOTAL = -1;

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	public int total = INITIALTOTAL;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INITIALTOTAL;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int prevValue() {
		if (callCheck())
			return INITIALTOTAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INITIALTOTAL;
		return numbers[total--];
	}
}
