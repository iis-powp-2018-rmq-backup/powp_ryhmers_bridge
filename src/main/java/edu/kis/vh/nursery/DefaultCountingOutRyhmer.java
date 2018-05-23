package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {

	private IntLinkedList list;

	public DefaultCountingOutRyhmer() {
		list = new IntLinkedList();
	}
	
	public DefaultCountingOutRyhmer(IntLinkedList list) {
		this.list = list;
	}

	public int getTotal() {
		return list.getSize();
	}

	public void countIn(int in) {
		list.push(in);
	}

	public boolean callCheck() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int countOut() {
		return list.pop();
	}
	
	protected int peekaboo() {
		return list.top();
	}
	
}
