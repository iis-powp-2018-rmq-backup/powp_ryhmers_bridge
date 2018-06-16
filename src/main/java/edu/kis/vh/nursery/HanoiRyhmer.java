package edu.kis.vh.nursery;

import lombok.Getter;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	@Getter
	private int totalRejected = 0;

	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo()) {
            totalRejected = totalRejected + 1;
		} else {
			super.countIn(in);
		}
	}
}