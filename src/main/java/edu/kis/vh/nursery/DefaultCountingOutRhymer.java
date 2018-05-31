package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/*
 * Wyliczanki zostaly zachowane, aby mozna bylo korzystac z konkretnych implementacji wyliczanek
 */
public class DefaultCountingOutRhymer {

	IntLinkedList intLinkedList;
	
	public DefaultCountingOutRhymer() {
		super();
		this.intLinkedList = new IntLinkedList();
	}
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		super();
		this.intLinkedList = intLinkedList;
	}


	public int getTotal() {
		return intLinkedList.getTotal();
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public int peekaboo() {
		return intLinkedList.top();
	}

	public int countOut() {
		return intLinkedList.pop();
	}
}
