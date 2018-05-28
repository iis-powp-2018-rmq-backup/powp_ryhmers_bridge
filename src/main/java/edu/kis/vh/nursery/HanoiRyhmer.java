package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;
	
	

	public HanoiRyhmer() {
		super();
	}

	public HanoiRyhmer(StackInterface intArray) {
		super(intArray);
	}

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}
}

//alt + -> przeskakuje miedzy ostatnimi kursorami 
