package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	public static final int ARRAY_SIZE = 12;
	public static final int EMPTY_ARRAY = -1;
	private int[] numbers = new int[ARRAY_SIZE];


	public int total =  EMPTY_ARRAY;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == EMPTY_ARRAY;
	}

	public boolean isFull() {
		return total == ARRAY_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return EMPTY_ARRAY;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return EMPTY_ARRAY;
		}
		return numbers[total--];
	}

}
