package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	public FIFORyhmer() {
	}

	public FIFORyhmer(IntStackInterface intLinkedList) {
		super(intLinkedList);
	}

	private final IntStackInterface temp = new IntArrayStack();

	@Override
	public int countOut() {		
		while (!callCheck())
			temp.push(super.countOut());
		int ret = temp.pop();
		while (!temp.isEmpty())
			countIn(temp.pop());
		return ret;
	}
}

//IntArrayStack to lepszy wybór ponieważ w temp potrzebujemy jedynie ostatniej wartości więc rezerwujemy mniej pamięci
