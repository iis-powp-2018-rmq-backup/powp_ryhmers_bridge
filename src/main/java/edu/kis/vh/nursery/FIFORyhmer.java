package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	public FIFORyhmer() {
	}

	public FIFORyhmer(Stackable list) {
		super(list);
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
