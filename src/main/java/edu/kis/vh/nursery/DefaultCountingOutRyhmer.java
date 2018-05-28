package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
//(ctrl+b) goes to declaration of selected method.
	final IntLinkedList intLinkedList = new IntLinkedList();

	public DefaultCountingOutRyhmer() {
	}

	public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
		this.intLinkedList.setIntArrayStack(intArrayStack);
	}

	public int getTotal() {
		return intLinkedList.getTotal();
	}

	protected void countIn(final int in) {
		intLinkedList.countIn(in);
	}

	protected boolean callCheck() {
		return intLinkedList.callCheck();
	}

	protected boolean isFull() {
		return intLinkedList.isFull();
	}

	protected int peekaboo() {
		return intLinkedList.peekaboo();
	}

	protected int countOut() {
		return intLinkedList.countOut();
	}

}
