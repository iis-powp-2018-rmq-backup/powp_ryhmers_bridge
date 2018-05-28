package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.StackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public HanoiRyhmer() {
	}

	public HanoiRyhmer(StackInterface stack) {
		super(stack);
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
