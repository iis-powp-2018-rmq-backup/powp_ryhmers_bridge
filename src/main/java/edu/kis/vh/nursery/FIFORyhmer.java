package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.StackInterface;

// 3.1.14 	- we need stack without capacity, because we push many values and after that we pop out all of them.

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final StackInterface temp = new IntLinkedList();
	
	
	public FIFORyhmer() {
		super();
	}


	public FIFORyhmer(StackInterface intArray) {
		super(intArray);
	}


	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.push(super.countOut());
		
		final int ret = temp.pop();
		
		while (!temp.isEmpty())
			
			countIn(temp.pop());

		return ret;
	}
}
