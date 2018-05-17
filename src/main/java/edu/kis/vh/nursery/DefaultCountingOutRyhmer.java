package edu.kis.vh.nursery;

import stack.IntArrayStack;

public class DefaultCountingOutRyhmer {

	private IntArrayStack intArrayStack;

	public DefaultCountingOutRyhmer() {
		intArrayStack = new IntArrayStack();
	}
	
	public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
	
	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}
	
//	private static final int EMPTY_ARRAY = -1;
//
//	private static final int CAPACITY = 12;
//
//	private final int[] numbers = new int[CAPACITY];
//
//	private int total = EMPTY_ARRAY;
//
//	public int getTotal() {
//		return total;
//	}
//
//	/**
//	 * @param in any number
//	 */
//	public void countIn(int in) {
//		if (!isFull())
//			numbers[++total] = in;
//	}
//
//	public boolean callCheck() {
//		return total == EMPTY_ARRAY;
//	}
//
//	public boolean isFull() {
//		return total == 11;
//	}
//
//	protected int peekaboo() {
//		if (callCheck())
//			return EMPTY_ARRAY;
//		return numbers[total];
//	}
//
//	public int countOut() {
//		if (callCheck())
//			return EMPTY_ARRAY;
//		return numbers[total--];
//	}
/*
 * alt + left arrow = move back to previously modified file 
 * alt + right arrow = move forward to lately modified file
 */
}
