package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

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