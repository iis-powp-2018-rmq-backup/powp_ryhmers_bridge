package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStack {

	private static final int STARTINGTOTAL = -1;

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	private int total = STARTINGTOTAL;

	/**
	 * @param in Liczba do wliczenia w wyliczankę.
	 */
	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return Czy wyliczanka jest pusta.
	 */
	@Override
	public boolean isEmpty() {
		return total == STARTINGTOTAL;
	}

	/**
	 * @return Czy wyliczanka jest zapełniona.
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * @return Ostatnia wartość w wyliczance (lub -1 jeżeli pusta).
	 */
	@Override
	public int top() {
		if (isEmpty())
			return STARTINGTOTAL;
		return numbers[total];
	}

	/**
	 * @return "Pozbycie" się ostatniej liczby z wyliczanki oraz zwrócenie "usuniętej" liczby (lub -1 jeżeli nie ma co usunąć).
	 */
	public int pop() {
		if (isEmpty())
			return STARTINGTOTAL;
		return numbers[total--];
	}

}
