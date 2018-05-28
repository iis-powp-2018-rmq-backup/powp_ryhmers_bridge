package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private IntArrayStack temp = new IntArrayStack();

	public FIFORyhmer(IntLinkedListInterface intLinkedListInterface) {
		super(intLinkedListInterface);
	}

    public FIFORyhmer()
    {

    }

	@Override
	public int countOut() {
		while (!callCheck())

			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())

			countIn(temp.pop());

		return ret;
	}
	/*

	Alt + stralki służą do przeskakiwania pomiędzy otwartymi oknami

	 */
}
