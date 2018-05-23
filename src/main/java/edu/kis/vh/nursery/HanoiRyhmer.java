package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public HanoiRyhmer() {
	}

	public HanoiRyhmer(Stack stack) {
		super(stack);
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
	/*
	*Kombinacja klawiszy "alt + ->" lub "alt + <-" umożliwia nam powrócenie
	 * do poprzedniego położenia kursora */
}
