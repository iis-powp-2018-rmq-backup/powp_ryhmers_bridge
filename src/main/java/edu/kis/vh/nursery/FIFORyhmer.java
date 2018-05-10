package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();
	
	@Override
	protected int countOut() {
		while (!callCheck())
			
		defaultCountingOutRyhmer.countIn(super.countOut());
		
		int ret = defaultCountingOutRyhmer.countOut();
		
		while (!defaultCountingOutRyhmer.callCheck())
			
		countIn(defaultCountingOutRyhmer.countOut());
		
		return ret;
	}
}
