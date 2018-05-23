package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.RhymersInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private IntArrayStack temp = new IntArrayStack();

	public FIFORhymer(RhymersInterface intArrayStack) {
		super(intArrayStack);
	}

	public FIFORhymer() {
	}

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
