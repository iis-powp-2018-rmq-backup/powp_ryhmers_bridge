package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(StackInterface intArray) {
		super(intArray);
	}

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
