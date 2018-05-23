package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.intType.IntContainer;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	public FIFORyhmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORyhmer(IntContainer arrayStack) {
		super(arrayStack);
		// TODO Auto-generated constructor stub
	}

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
