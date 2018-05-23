package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	public HanoiRyhmer() {
	}

	public HanoiRyhmer(IntStackInterface intLinkedList) {
		super(intLinkedList);
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

	int getTotalRejected() {
		return totalRejected;
	}
}