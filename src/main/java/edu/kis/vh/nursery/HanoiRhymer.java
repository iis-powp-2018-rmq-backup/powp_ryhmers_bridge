package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * @author Mrucznik
 * Klasa zawierająca implementacje wyliczanki typu Hanoi
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return ilość odrzuconych liczb
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Funkcja uruchamiajaca wyliczankę
	 * @param in ilość liczb do wyliczenia
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
