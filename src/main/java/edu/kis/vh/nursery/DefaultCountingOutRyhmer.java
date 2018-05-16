package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int EMPTY_VALUE = -1;

	private static final int MAX_CAPACITy = 12;

	private final int[] numbers = new int[MAX_CAPACITy]; //12 raczej nie nazywac SIZE !!! raczej capacity !!!

	private int total = EMPTY_VALUE; //value if empty 

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY_VALUE;
	}

	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total--];
	}

}
