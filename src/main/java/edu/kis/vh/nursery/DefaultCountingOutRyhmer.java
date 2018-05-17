package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {

	private IntLinkedList intArray;

	public DefaultCountingOutRyhmer(){
		this.intArray = new IntLinkedList();
	}

	public DefaultCountingOutRyhmer(IntLinkedList intArray) {
		super();
		this.intArray = intArray;
	}

	public int getTotal() {
		return intArray.getSize();
	}

	public void countIn(int in) {
		intArray.push(in);
	}
//	Open Declaration opens the implementation of the method, from which we delegate
	public boolean callCheck() {
		return intArray.isEmpty();
	}

	public boolean isFull() {
		return intArray.isFull();
	}

	public int peekaboo() {
		return intArray.top();
	}

	public int countOut() {
		return intArray.pop();
	}




}
