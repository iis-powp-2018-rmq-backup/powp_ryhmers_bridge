package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(Stack stack) {
		super(stack);
	}

	private final IntArrayStack temp = new IntArrayStack();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())

			countIn(temp.pop());

		return ret;
	}
}

// IntArrayStack will be better, because it will take less space