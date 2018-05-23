package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.RhymersInterface;

public class DefaultCountingOutRhymer {

	private RhymersInterface intArrayStack;

	public DefaultCountingOutRhymer(RhymersInterface intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer(){
		this.intArrayStack = new IntArrayStack();
	}

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.top();
	}

	public int countOut() {
		return intArrayStack.pop();
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}
}
