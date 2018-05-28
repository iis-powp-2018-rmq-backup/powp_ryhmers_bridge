package edu.kis.vh.nursery;

/**
 * @author student
 *
 */
public class DefaultCountingOutRyhmer {

	private IntArrayStack intArray;

	public DefaultCountingOutRyhmer() {
		super();
		this.intArray = new IntArrayStack();
	}
	
	public DefaultCountingOutRyhmer(IntArrayStack intArray) {
		super();
		this.intArray = intArray;
	}
	
	public int getTotal() {
		return intArray.getTotal();
	}

	void countIn(int in) {
		intArray.countIn(in);
	}

	 boolean callCheck() {
		return intArray.callCheck();
	}

	 boolean isFull() {
		return intArray.isFull();
	}

	 int peekaboo() {
		 return intArray.peekaboo();
	}

	 int countOut() {
		 return intArray.countOut();];
	}
	

}
