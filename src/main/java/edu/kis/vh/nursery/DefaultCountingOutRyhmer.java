package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	final private int[] NUMBERS;
	private int total;
	private final int totalMax;
	private final static int emptyStructCode = -1;

	public DefaultCountingOutRyhmer() {
		NUMBERS = new int[12];
		total = -1;
		totalMax = 11;
	}

	public boolean callCheck() {
		return total == emptyStructCode;
	}
		
	public boolean isFull() {
		return total == totalMax;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return emptyStructCode;
		}
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck()) {
			return emptyStructCode;
		}
		return NUMBERS[total--];
	}

	public void countIn(final int input) {
		if (!isFull()) {
			total = total + 1;
			NUMBERS[total] = input;
		}
	}

}