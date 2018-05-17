package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.*;

public class DefaultCountingOutRyhmer {
	private Stack list; //wylicznka teraz przyjmuje wspólny interfejs dlatego tez może korzystać z implementacji stosu lub listy
	
	public DefaultCountingOutRyhmer() {
		list = new IntLinkedList();
	}

	public DefaultCountingOutRyhmer(Stack stack) {
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


