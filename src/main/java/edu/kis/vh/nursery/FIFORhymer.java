package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer defaultCountingOutRyhmer = new DefaultCountingOutRhymer();

	
	
	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FIFORhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
		// TODO Auto-generated constructor stub
	}



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
