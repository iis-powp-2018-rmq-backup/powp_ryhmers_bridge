package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * @author student
 *
 */

//Open Declaration opens the implementation of the method, from which we delegate


public class DefaultCountingOutRyhmer {

	private IntLinkedList intArray;

	public DefaultCountingOutRyhmer() {
		super();
		this.intArray = new IntLinkedList();
	}
	
	public DefaultCountingOutRyhmer(IntLinkedList intArray) {
		super();
		this.intArray = intArray;
	}
	
	public int getTotal() {
		return intArray.getSize();
	}

	void countIn(int in) {
		intArray.push(in);
	}

	 boolean callCheck() {
		return intArray.isEmpty();
	}

	 boolean isFull() {
		return intArray.isFull();
	}

	 int peekaboo() {
		 return intArray.top();
	}

	 int countOut() {
		 return intArray.pop();
	}
	

}
