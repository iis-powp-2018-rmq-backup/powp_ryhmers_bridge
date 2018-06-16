package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer defaultCountingOutRyhmer;

	public FIFORyhmer () {
		defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();
	}

	@Override
	public int countOut() {
		int returnCountOut;
		while (!callCheck()) {
			defaultCountingOutRyhmer.countIn(super.countOut());
		}

		returnCountOut = defaultCountingOutRyhmer.countOut();

		while (!defaultCountingOutRyhmer.callCheck()) {
			countIn(defaultCountingOutRyhmer.countOut());
		}
		return returnCountOut;
	}
}
