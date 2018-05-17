package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
	
	private IntArrayStack intArray;
	
	public DefaultCountingOutRyhmer() {
		intArray = new IntArrayStack();
	}
	
	public DefaultCountingOutRyhmer(IntArrayStack intArray) {
		super();
		this.intArray = intArray;
	}
	
	public int getTotal() {
		return intArray.getTotal();
	}

	public void countIn(int in) {
		intArray.countIn(in);
	}

	public boolean callCheck() {
		return intArray.callCheck();
	}

	public boolean isFull() {
		return intArray.isFull();
	}

	public int countOut() {
		return intArray.countOut();
	}

	public int peekaboo() {
		return intArray.peekaboo();
	}	
}
