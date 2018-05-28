package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();
	
	
	
	public FIFORyhmer() {
		super();
	}



	public FIFORyhmer(StackInterface intArray) {
		super(intArray);
	}



	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		final int ret = temp.countOut();
		
		while (!temp.callCheck())
			
			countIn(temp.countOut());

		return ret;
	}
}
