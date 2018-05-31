package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.*;


public class DefaultCountingOutRhymer {
	private IntArrayStack IntArray;

	
	public DefaultCountingOutRhymer() {
		super();
		IntArray = new IntArrayStack();
	}
	
	public DefaultCountingOutRhymer(IntArrayStack intArray) {
		super();
		IntArray = intArray;
	}

	public int getTotal() {
		return IntArray.getTotal();
	}

	public void countIn(int in) {
		IntArray.countIn(in);
	}

	public int lastValue() {
		return IntArray.lastValue();
	}

	public boolean callCheck() {
		return IntArray.callCheck();
	}

	public boolean isFull() {
		return IntArray.isFull();
	}

	public int countOut() {
		return IntArray.countOut();
	}
	
}
