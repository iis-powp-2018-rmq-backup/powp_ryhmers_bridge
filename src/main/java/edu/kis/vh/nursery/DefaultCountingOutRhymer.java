package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.*;

public class DefaultCountingOutRhymer {
	private IntStack intStack;

	public DefaultCountingOutRhymer() {
		super();
		this.intStack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntStack intList) {
		super();
		this.intStack = intList;
	}

	public int prevValue() {
		return intStack.top();
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

	public int countOut() {
		return intStack.pop();
	}

}
