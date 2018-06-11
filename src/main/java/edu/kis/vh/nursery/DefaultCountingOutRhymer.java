package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.*;

public class DefaultCountingOutRhymer {
	private IntLinkedList IntList;

	public DefaultCountingOutRhymer() {
		super();
	}

	public DefaultCountingOutRhymer(IntLinkedList intList) {
		super();
		IntList = intList;
	}

	public int prevValue() {
		return IntList.top();
	}

	public void countIn(int in) {
		IntList.push(in);
	}

	public boolean callCheck() {
		return IntList.isEmpty();
	}

	public boolean isFull() {
		return IntList.isFull();
	}

	public int countOut() {
		return IntList.pop();
	}

}
