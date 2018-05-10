package edu.kis.vh.nursery;

public class HanoiRyhmer extends defaultCountingOutRyhmer {

	int totalRejected = 0;

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
	/*
	*Kombinacja klawiszy "alt + ->" lub "alt + <-" umożliwia nam powrócenie
	 * do poprzedniego położenia kursora */
}
