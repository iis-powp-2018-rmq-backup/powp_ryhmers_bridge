package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();
	
	@Override
	protected int countOut() {
		while (!intArray.callCheck())
			
		defaultCountingOutRyhmer.countIn(super.countOut());
		
		final int ret = defaultCountingOutRyhmer.countOut();
		
		while (!defaultCountingOutRyhmer.callCheck())

            intArray.countIn(defaultCountingOutRyhmer.countOut());
		
		return ret;
	}
}
