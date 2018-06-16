package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRyhmer {

	IntArrayStack list;

	public DefaultCountingOutRyhmer() {
		list = new IntArrayStack();
	}

	public boolean callCheck() {
		return list.isEmpty();
	}
		
	public boolean isFull() {
		return list.isFull();
	}
		
	protected int peekaboo() {
		return list.top();
	}

	public int countOut() {
		return list.pop();
	}

	public void countIn(final int input) {
		list.push(input);
	}

}