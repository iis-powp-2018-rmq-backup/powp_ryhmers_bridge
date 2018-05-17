package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

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
	
}
