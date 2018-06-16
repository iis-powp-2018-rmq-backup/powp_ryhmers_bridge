package edu.kis.vh.nursery;

import lombok.Getter;

/**
 *
 * Hanoi - wyliczanka.
 */
public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	@Getter
	private int totalRejected;

	public HanoiRyhmer() {
		totalRejected = 0;
	}

	/**
	 * Umieszcza podaną wartość do systemu (wyliczanki).
	 * @param input - wartość, którą zamierzamy umieścić w naszym systemie.
	 */
	@Override
	public void countIn(final int input) {
		if (!callCheck() && input > peekaboo()) {
			totalRejected = totalRejected + 1;
		} else {
			super.countIn(input);
		}
	}
}