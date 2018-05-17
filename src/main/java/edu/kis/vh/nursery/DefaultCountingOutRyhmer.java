package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private IntArrayStack intArray;

	public DefaultCountingOutRyhmer(){
		this.intArray = new IntArrayStack();
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
//	Open Declaration opens the implementation of the method, from which we delegate
	public boolean callCheck() {
		return intArray.callCheck();
	}

	public boolean isFull() {
		return intArray.isFull();
	}

	public int peekaboo() {
		return intArray.peekaboo();
	}

	public int countOut() {
		return intArray.countOut();
	}




}
