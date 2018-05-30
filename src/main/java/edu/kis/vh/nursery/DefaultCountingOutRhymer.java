package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private CountingContainer countingContainer;

	public DefaultCountingOutRhymer()
	{
		this.countingContainer = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(CountingContainer cc)
	{
		this.countingContainer = cc;
	}

	public int getTotal() {
		return countingContainer.getTotal();
	}

	public void countIn(int in) {
        countingContainer.push(in);
	}

	boolean callCheck() {
		return countingContainer.isEmpty();
	}

	boolean isFull() {
		return countingContainer.isFull();
	}

	int peekaboo() {
		return countingContainer.top();
	}

	public int countOut() {
		return countingContainer.pop();
	}
}