package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stackable;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final Stackable temp = new IntArrayStack();

	public FIFORyhmer() {
	}

	public FIFORyhmer(Stackable list) {
		super(list);
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
	 * Najlepszym wyborem jest IntArrayStack, ponieważ potrzebujemy 
	 * ostatniej wartości a tablica wymaga mniej zasobów.
	 */
}
