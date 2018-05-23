package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.intType.IntContainer;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	public HanoiRyhmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRyhmer(IntContainer arrayStack) {
		super(arrayStack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

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
