package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final IntArrayStack temp = new IntArrayStack();

	public FIFORyhmer() {
	}


	public FIFORyhmer(Stack stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck()) {
			temp.push(super.countOut());
		}

		int ret = temp.pop();

		while (!temp.isEmpty()) {
			countIn(temp.pop());
		}

		return ret;
	}
}
