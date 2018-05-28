package edu.kis.vh.nursery.stack;

public class IntArrayStack implements StackInterface{
	private static final int _NUMBERS_SIZE = 12;
	private static final int _1 = -1;
	private final int[] NUMBERS = new int[_NUMBERS_SIZE];
	private int total = _1;
	

	@Override
	public boolean isEmpty() {
		return total == _1;
	}
	
	@Override
 	public boolean isFull() {
 		return total == _NUMBERS_SIZE + _1;
 	}
	
	@Override
	public void push(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	 }	 

	@Override
	public int top() {
		if (isEmpty())
			return _1;
		return NUMBERS[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return _1;
		return NUMBERS[total--];
	}

	@Override
	public int getSize() {
		return total;
	}

}
