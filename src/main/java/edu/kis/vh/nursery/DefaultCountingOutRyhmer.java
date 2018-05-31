package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
	private IntArrayStack intArrayStack;

	public DefaultCountingOutRyhmer() {
		this(new IntArrayStack());
	}

	public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
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

	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
}
