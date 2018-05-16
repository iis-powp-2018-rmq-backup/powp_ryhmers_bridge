package edu.kis.vh.nursery;

/**
 * Wyliczanka Hanoi
 *
 */
public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	/**
	 * Zwraca ilość nieprzyjętych liczb do wyliczanki
	 * @return ilość nieprzyjętych liczb do wyliczanki
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Umieszcza podaną wartość w wyliczance(nie jest możliwe zgłoszenie liczby większej niż bieżaca)
	 * @param wartość liczby do umieszczenia w wyliczance
	 */
	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
