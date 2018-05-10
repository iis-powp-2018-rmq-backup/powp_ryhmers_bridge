package edu.kis.vh.nursery;

/**
 * @author student
 *
 */
public class DefaultCountingOutRyhmer {

	private static final int _NUMBERS_SIZE = 12;
	private static final int _1 = -1;
	private int[] NUMBERS = new int[_NUMBERS_SIZE];
	private int total = _1;

	 void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	 boolean callCheck() {
		return total == -1;
	}

	 boolean isFull() {
		return total == 11;
	}

	 int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}

	 int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
