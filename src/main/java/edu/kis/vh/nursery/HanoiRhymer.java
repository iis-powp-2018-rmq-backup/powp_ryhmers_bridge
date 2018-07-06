package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntStack intStack) {
		super(intStack);
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > prevValue())
			totalRejected++;
		else
			super.countIn(in);
	}
}
