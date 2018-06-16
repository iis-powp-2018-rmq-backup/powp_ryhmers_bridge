package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IStackImplementation;
import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRyhmer {

	IStackImplementation list;
	// Dzięki zmianie, będziemy mogli przekazać dowolną implementację naszej struktury.
	public DefaultCountingOutRyhmer() {
		list = new IntArrayStack();
	}

	public DefaultCountingOutRyhmer(IStackImplementation stackImplementation) {
		list = stackImplementation;
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