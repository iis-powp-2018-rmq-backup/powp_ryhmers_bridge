package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
// Alt + Right Arrow = przejscie do przodu po plikach, zgodnie z kolejnoscia edycji.
// Alt + Left Arrow = przejscie wstecz po plikach zgodnie historia edycji.
}
