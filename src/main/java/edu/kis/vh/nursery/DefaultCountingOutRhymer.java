package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class DefaultCountingOutRhymer {
	protected Stack list;

	public DefaultCountingOutRhymer() {
		this.list = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(Stack list) {
		this.list = list;
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

	public int peekaboo() {
		return list.top();
	}

	public int countOut() {
		return list.pop();
	}

}
// 3.1.7 Dzięki tej zmianie możemy decydować o wykorzystaniu IntLinkedList oraz IntArrayStack
