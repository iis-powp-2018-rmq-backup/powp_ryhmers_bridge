package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

	public FIFORyhmer(IntLinkedListInterface intLinkedListInterface) {
		super(intLinkedListInterface);
	}

    public FIFORyhmer()
    {

    }

	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
	/*

	Alt + stralki służą do przeskakiwania pomiędzy otwartymi oknami

	 */
}
