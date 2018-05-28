package edu.kis.vh.nursery;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!intLinkedList.callCheck() && in > intLinkedList.peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
