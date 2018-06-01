package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.Stack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	
	public HanoiRhymer() {
	}

	public HanoiRhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
