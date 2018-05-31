package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStack;

public class DefaultCountingOutRyhmer {
	/**
	 * Dzięki zastosowaniu wspólnego interfejsu w IntLinkedList oraz IntArrayStack
	 * możemy bez problemu używać tych 2 klas wymiennie (w zależności od tego która implementacja jest nam potrzebna)
	 */

	private IntStack intStack;

	public DefaultCountingOutRyhmer() {
		this(new IntLinkedList());
	}

	public DefaultCountingOutRyhmer(IntStack intStack) {
		this.intStack = intStack;
	}

	public void countIn(int in) {
		intStack.push(in);
	}

	public boolean callCheck() {
		return intStack.isEmpty();
	}

	public boolean isFull() {
		return intStack.isFull();
	}

	protected int peekaboo() {
		return intStack.top();
	}

	public int countOut() {
		return intStack.pop();
	}
}
