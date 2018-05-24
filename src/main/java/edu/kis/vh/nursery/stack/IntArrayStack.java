package edu.kis.vh.nursery.stack;

public class IntArrayStack implements StackInterface{

	private static final int NUMBERS_CAPACITY = 12;

	private int[] numbers = new int[NUMBERS_CAPACITY];

	private int total = StackInterface.DEFAULT_EMPTY_STACK_VALUE;

	@Override
	public int getSize() {
		return total;
	}

	@Override
	public void push(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == StackInterface.DEFAULT_EMPTY_STACK_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == NUMBERS_CAPACITY + StackInterface.DEFAULT_EMPTY_STACK_VALUE;
	}

	@Override
	public int top() {
		if (isEmpty())
			return StackInterface.DEFAULT_EMPTY_STACK_VALUE;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return StackInterface.DEFAULT_EMPTY_STACK_VALUE;
		return numbers[total--];
	}
}
