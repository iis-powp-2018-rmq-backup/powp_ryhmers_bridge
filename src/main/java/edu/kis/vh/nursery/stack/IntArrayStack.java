package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stackable {
	
	private static final int EMPTY_ARRAY = -1;

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int size = EMPTY_ARRAY;

	@Override
	public int getSize() {
		return size;
	}

	/**
	 * @param in any number
	 */
	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++size] = in;
	}

	@Override
	public boolean isEmpty() {
		return size == EMPTY_ARRAY;
	}

	@Override
	public boolean isFull() {
		return size == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_ARRAY;
		return numbers[size];
	}

	@Override
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
