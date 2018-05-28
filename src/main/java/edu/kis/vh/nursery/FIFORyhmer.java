package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();

	@Override
	protected int countOut() {
		while (!ryhmer.callCheck())
			
		ryhmer.countIn(super.countOut());
		
		final int ret = ryhmer.countOut();
		
		while (!ryhmer.callCheck())

            ryhmer.countIn(ryhmer.countOut());
		
		return ret;
	}
}
