package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
	}

	public FIFORyhmer(IntStackInterface intLinkedList) {
		super(intLinkedList);
	}

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
