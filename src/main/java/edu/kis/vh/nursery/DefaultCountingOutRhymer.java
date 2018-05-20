package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int VALUE_IF_EMPTY = -1;

	private static final int CAPACITY = 12;

	private int[] NUMBERS = new int[CAPACITY];

	private int totalIfEmpty = VALUE_IF_EMPTY;

	public int getTotalIfEmpty() {
		return totalIfEmpty;
	}

	protected void countIn(int in) {
		if (!isFull()) {
			NUMBERS[++totalIfEmpty] = in;
		}
	}

	protected boolean callCheck() {
		return totalIfEmpty == -1;
	}

	protected boolean isFull() {
		return totalIfEmpty == 11;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return NUMBERS[totalIfEmpty];
	}

	protected int countOut() {
		if (callCheck()) {
			return -1;
		}
		return NUMBERS[totalIfEmpty--];
	}

}
