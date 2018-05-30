package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.CountingContainer;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

	public FIFORhymer() {
	}

	public FIFORhymer(CountingContainer cc) {
		super(cc);
	}


	@Override
	public int countOut() {
		while (!callCheck())

			getDefaultCountingOutRhymer().countIn(super.countOut());

		int returnedValue = getDefaultCountingOutRhymer().countOut();

		while (!getDefaultCountingOutRhymer().callCheck())

			countIn(getDefaultCountingOutRhymer().countOut());

		return returnedValue;
	}

	public DefaultCountingOutRhymer getDefaultCountingOutRhymer() {
		return defaultCountingOutRhymer;
	}

	public void setDefaultCountingOutRhymer(DefaultCountingOutRhymer defaultCountingOutRhymer) {
		this.defaultCountingOutRhymer = defaultCountingOutRhymer;
	}

	/*
	dostęp do obiektu klasy DefaultCountingOutRhymer jest teraz możliwy wyłącznie poprzez gettery i settery
	 */


}