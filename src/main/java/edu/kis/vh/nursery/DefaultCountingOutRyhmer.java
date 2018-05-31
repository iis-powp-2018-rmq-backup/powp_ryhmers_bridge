package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {
	private IntLinkedList intLinkedList;

	public DefaultCountingOutRyhmer() {
		this(new IntLinkedList());
	}

	public DefaultCountingOutRyhmer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	protected int peekaboo() {
		return intLinkedList.top();
	}

	public int countOut() {
		return intLinkedList.pop();
	}
}
