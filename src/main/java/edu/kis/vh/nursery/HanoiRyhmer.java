package edu.kis.vh.nursery;

/**
 * alt + strzałka lewo/prawo ustawia kursor na podstawie jego historii położenia.
 */


public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(in);
		}
	}
}
