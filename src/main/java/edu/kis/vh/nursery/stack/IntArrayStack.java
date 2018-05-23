package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stackable {
	
	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int size = Stackable.IS_EMPTY;

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
		return size == Stackable.IS_EMPTY;
	}

	@Override
	public boolean isFull() {
		return size == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return Stackable.IS_EMPTY;
		return numbers[size];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return Stackable.IS_EMPTY;
		return numbers[size--];
	}
/*
 * alt + left arrow = move back to previously modified file 
 * alt + right arrow = move forward to lately modified file
 */
}
