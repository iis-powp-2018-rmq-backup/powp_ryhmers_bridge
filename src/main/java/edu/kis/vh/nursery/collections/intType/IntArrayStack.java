package edu.kis.vh.nursery.collections.intType;

public class IntArrayStack implements IntContainer {
	private static final int EMPTY_VALUE = -1;

	private static final int MAX_CAPACITy = 12;

	private final int[] numbers = new int[MAX_CAPACITy]; //12 raczej nie nazywac SIZE !!! raczej capacity !!!

	private int total = EMPTY_VALUE; //value if empty 

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == EMPTY_VALUE;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#peekaboo()
	 */
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.collection.IntContainer#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total--];
	}

}
