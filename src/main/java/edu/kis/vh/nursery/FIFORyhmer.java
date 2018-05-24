package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(StackInterface intArray) {
		super(intArray);
	}

	private final StackInterface temp = new IntLinkedList();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		final int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
//	Because we push many values and after that we pop them out all,because of that we need stack without capacity.
}
