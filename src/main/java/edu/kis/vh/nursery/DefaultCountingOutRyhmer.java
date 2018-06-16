package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    IntArrayStack stack;

	public DefaultCountingOutRyhmer() {
	    stack = new IntArrayStack();
	}

	public boolean callCheck() {
		return stack.callCheck();
	}
		
	public boolean isFull() {
		return stack.isFull();
	}
		
	protected int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

	public void countIn(final int input) {
	    stack.countIn(input);
	}

}