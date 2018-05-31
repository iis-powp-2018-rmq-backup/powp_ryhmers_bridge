package edu.kis.vh.nursery;

/*
 * Wyliczanki zostaly zachowane, aby mozna bylo korzystac z konkretnych implementacji wyliczanek
 */
public class DefaultCountingOutRhymer {

	IntArrayStack intArrayStack;
	
	public DefaultCountingOutRhymer() {
		super();
		this.intArrayStack = new IntArrayStack();
	}
	
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		super();
		this.intArrayStack = intArrayStack;
	}


	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
}
