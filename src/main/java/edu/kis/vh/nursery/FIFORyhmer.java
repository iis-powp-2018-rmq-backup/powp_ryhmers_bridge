package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(Stack stack) {
		super(stack);
	}

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
