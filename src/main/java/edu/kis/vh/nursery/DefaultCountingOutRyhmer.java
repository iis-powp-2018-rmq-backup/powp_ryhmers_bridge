package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.StackInterface;

public class DefaultCountingOutRyhmer {
//	This change, make for us to use more dynamically classes that implements StackInterface
	private StackInterface intArray;

	public DefaultCountingOutRyhmer(){
		this.intArray = new IntLinkedList();
	}

	public DefaultCountingOutRyhmer(StackInterface intArray) {
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

	protected int peekaboo() {
		return intArray.top();
	}

	public int countOut() {
		return intArray.pop();
	}




}
