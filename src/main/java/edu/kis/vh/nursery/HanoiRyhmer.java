package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public HanoiRyhmer() {
		super();
	}

	public HanoiRyhmer(IntStack intStack) {
		super(intStack);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(in);
		}
	}
}

// Kombinacja Alt + Strzałka lewo / prawo ustawia kursor edycji tekstu w poprzednie / następne położenie zgodnie z historią jego położeń.