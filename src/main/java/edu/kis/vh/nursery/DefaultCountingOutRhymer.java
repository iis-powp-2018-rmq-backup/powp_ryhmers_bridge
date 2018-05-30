package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;

	public DefaultCountingOutRhymer()
	{
		this.intArrayStack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack ias)
	{
		this.intArrayStack = ias;
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	boolean callCheck() {
		return intArrayStack.callCheck();
	}

	boolean isFull() {
		return intArrayStack.isFull();
	}

	int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
}