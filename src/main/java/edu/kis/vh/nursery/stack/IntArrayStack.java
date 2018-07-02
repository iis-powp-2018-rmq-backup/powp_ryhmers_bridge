package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack{

	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	public int total = Stack.isEmptyIndicator;

	public int getTotal() {
		return total;
	}

	public void push(int in) {
		if (!isFull())
			numbers[total++] = in;
	}

	public boolean isEmpty() {
		return total == Stack.isEmptyIndicator;
	}

	public boolean isFull() {
		return total == CAPACITY;
	}

	public int top() {
		if (isEmpty())
			return Stack.isEmptyIndicator;
		return numbers[total];
	}

	public int pop() {
		if (isEmpty())
			return Stack.isEmptyIndicator;
		return numbers[--total];
	}

}
