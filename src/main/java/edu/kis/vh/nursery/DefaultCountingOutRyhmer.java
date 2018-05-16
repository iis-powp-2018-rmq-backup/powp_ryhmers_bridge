package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private static final int IS_EMPTY_INDICATOR = -1;

	private static final int CAPACITY = 12;

	private int[] numbers = new int[CAPACITY];

	private int total = IS_EMPTY_INDICATOR;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == IS_EMPTY_INDICATOR;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return IS_EMPTY_INDICATOR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return IS_EMPTY_INDICATOR;
		return numbers[total--];
	}

}

// przeskakiwanie pomiedzy miejscami ktore ostatnio edytowalismy strzałka w lewo powoduje przejscie w przod histori a w prawo do tyłu


