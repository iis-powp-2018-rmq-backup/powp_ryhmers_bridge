package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.RhymersInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(RhymersInterface intArrayStack) {
		super(intArrayStack);
	}

	public HanoiRhymer() {
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//	kombinacje alt+<- oraz alt+-> przelaczaja pomiedzy ostatnio otwieranymi klasami zapamietujac pozycje kursora