package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntStack intStack) {
		super(intStack);
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
	if (!callCheck() && in > lastValue())
		totalRejected++;
	else
		super.countIn(in);
	}
// Alt + Right Arrow = przejscie do przodu po plikach, zgodnie z kolejnoscia edycji.
// Alt + Left Arrow = przejscie wstecz po plikach zgodnie historia edycji.
}
