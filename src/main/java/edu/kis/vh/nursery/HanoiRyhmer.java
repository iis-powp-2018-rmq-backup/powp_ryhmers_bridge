package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	public HanoiRyhmer() {
		super();
	}

	public HanoiRyhmer(StackInterface intArray) {
		super(intArray);
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	public int getTotalRejected() {
		return totalRejected;
	}
}
