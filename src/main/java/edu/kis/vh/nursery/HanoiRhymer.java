package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.CountingContainer;

public class HanoiRhymer extends DefaultCountingOutRhymer {
	
	private int totalRejected = 0;

	protected int reportRejected() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	public HanoiRhymer() {
	}

	public HanoiRhymer(CountingContainer cc) {
		super(cc);
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}

	/*
	dostęp do zmiennej totalRejected jest teraz możliwy wyłącznie poprzez gettery i settery
	 */
}