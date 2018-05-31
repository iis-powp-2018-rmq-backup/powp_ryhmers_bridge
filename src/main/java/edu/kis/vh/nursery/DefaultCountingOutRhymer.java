package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/*
 * Wyliczanki zostaly zachowane, aby mozna bylo korzystac z konkretnych implementacji wyliczanek
 */
public class DefaultCountingOutRhymer {

	IIntStack intStack;
	
	public DefaultCountingOutRhymer() {
		super();
		this.intStack = new IntLinkedList();
	}
	
	public DefaultCountingOutRhymer(IIntStack intStack) {
		super();
		this.intStack = intStack;
	}


	public int getTotal() {
		return intStack.getTotal();
	}

	public void countIn(int in) {
		intStack.push(in);
	}

	public boolean isFull() {
		return intStack.isFull();
	}

	public boolean callCheck() {
		return intStack.isEmpty();
	}

	public int peekaboo() {
		return intStack.top();
	}

	public int countOut() {
		return intStack.pop();
	}
}
