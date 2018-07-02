package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackImplementation;

//TODO: extract interface Ryhmer | refactoring to bridge pattern

public class DefaultCountingOutRyhmer {

	private StackImplementation list;
	
	public DefaultCountingOutRyhmer() {
		list = new IntLinkedList();
	}

	public DefaultCountingOutRyhmer(StackImplementation stack) {
		super();
		this.list = stack;
	}
	
	public int getTotal() {
		return list.getTotal();
	}

	public void countIn(int in) {
		list.push(in);
	}

	protected boolean callCheck() {
		return list.isEmpty()();
	}

	protected boolean isFull() {
		return list.isFull();
	}

	protected int peekaboo() {
		return list.top();
	}

	protected int countOut() {
		return list.pop();
	}

}
