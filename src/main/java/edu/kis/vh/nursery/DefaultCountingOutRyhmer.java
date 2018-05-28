package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private final IntArray intArray = new IntArray();

	public DefaultCountingOutRyhmer() {
	}

	public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
		this.intArray.setIntArrayStack(intArrayStack);
	}

	public int getTotal() {
		return intArray.getTotal();
	}

	protected void countIn(final int in) {
		intArray.countIn(in);
	}

	protected boolean callCheck() {
		return intArray.callCheck();
	}

	protected boolean isFull() {
		return intArray.isFull();
	}

	protected int peekaboo() {
		return intArray.peekaboo();
	}

	protected int countOut() {
		return intArray.countOut();
	}

}
