package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();
	
	@Override
	protected int countOut() {
		while (!intLinkedList.callCheck())
			
		defaultCountingOutRyhmer.countIn(super.countOut());
		
		final int ret = defaultCountingOutRyhmer.countOut();
		
		while (!defaultCountingOutRyhmer.callCheck())

            intLinkedList.countIn(defaultCountingOutRyhmer.countOut());
		
		return ret;
	}
}
