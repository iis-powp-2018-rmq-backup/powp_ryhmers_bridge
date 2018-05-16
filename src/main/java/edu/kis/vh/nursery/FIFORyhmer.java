package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	@Override
	public int countOut() {		
		while (!callCheck())
			temp.countIn(super.countOut());
		int ret = temp.countOut();
		while (!temp.callCheck())
			countIn(temp.countOut());
		return ret;
	}

	public DefaultCountingOutRyhmer getTemp() {
		return temp;
	}
}
