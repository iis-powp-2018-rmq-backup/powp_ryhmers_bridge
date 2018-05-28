package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackInterface;

/**
 * @author student
 *
 */

//Open Declaration opens the implementation of the method, from which we delegate

// 3.1.7 thanks to this change, we cen use more dynamically classes that implements StackInterface.



public class DefaultCountingOutRyhmer{

	private StackInterface intArray;

	public DefaultCountingOutRyhmer() {
		super();
		this.intArray = new IntLinkedList();
	}
	
	public DefaultCountingOutRyhmer(StackInterface  intArray) {
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
