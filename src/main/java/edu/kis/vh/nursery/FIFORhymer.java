package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntStack intStack) {
		super(intStack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
