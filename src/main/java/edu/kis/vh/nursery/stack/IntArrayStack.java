package edu.kis.vh.nursery.stack;

public class IntArrayStack {
	
	private static final int EMPTY_ARRAY = -1;

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int size = EMPTY_ARRAY;

	public int getSize() {
		return size;
	}

	/**
	 * @param in any number
	 */
	public void push(int in) {
		if (!isFull())
			numbers[++size] = in;
	}

	public boolean isEmpty() {
		return size == EMPTY_ARRAY;
	}

	public boolean isFull() {
		return size == 11;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_ARRAY;
		return numbers[size];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_ARRAY;
		return numbers[size--];
	}
/*
 * alt + left arrow = move back to previously modified file 
 * alt + right arrow = move forward to lately modified file
 */
}
