package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class DefaultCountingOutRyhmer {

    IntLinkedList list;

	public DefaultCountingOutRyhmer() {
		list = new IntLinkedList();
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