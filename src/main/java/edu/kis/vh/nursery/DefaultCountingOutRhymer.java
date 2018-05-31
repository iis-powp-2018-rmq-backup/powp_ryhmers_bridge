package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.*;


public class DefaultCountingOutRhymer {
	private IntStack intStack;

	public DefaultCountingOutRhymer() {
		super();
		this.intStack = new IntLinkedList();
	}
	
	public DefaultCountingOutRhymer(IntStack intStack) {
		super();
		this.intStack = intStack;
	}

	public void countIn(int in) {
		intStack.push(in);
	}

	public int lastValue() {
		return intStack.top();
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
