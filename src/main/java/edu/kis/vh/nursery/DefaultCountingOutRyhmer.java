package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.*;

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

// przeskakiwanie pomiedzy miejscami ktore ostatnio edytowalismy strzałka w lewo powoduje przejscie w przod histori a w prawo do tyłu


