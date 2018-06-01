package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;
	
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = new IntArrayStack();
    }
	public int getTotal() {
		return intArrayStack.getTotal();
	}


	protected void countIn(final int in) {
		intArrayStack.countIn(in);
	}

	protected boolean callCheck() {
		return intArrayStack.callCheck();
	}

	protected boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}

	protected int countOut() {
		return intArrayStack.countOut();
	}

}
