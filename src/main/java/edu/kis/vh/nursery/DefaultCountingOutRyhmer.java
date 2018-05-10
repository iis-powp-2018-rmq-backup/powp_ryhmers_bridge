package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

	private int[] numbers = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}

// przeskakiwanie pomiedzy miejscami ktore ostatnio edytowalismy strzałka w lewo powoduje przejscie w przod histori a w prawo do tyłu


