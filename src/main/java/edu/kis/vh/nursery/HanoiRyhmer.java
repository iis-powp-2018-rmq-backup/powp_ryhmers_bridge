package edu.kis.vh.nursery;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

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