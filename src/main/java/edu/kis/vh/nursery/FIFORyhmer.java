package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		defaultCountingOutRyhmer.countIn(super.countOut());
		
		int ret = defaultCountingOutRyhmer.countOut();
		
		while (!defaultCountingOutRyhmer.callCheck())
			
		countIn(defaultCountingOutRyhmer.countOut());
		
		return ret;
	}
}
