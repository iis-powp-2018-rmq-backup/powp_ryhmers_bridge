package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {
	
	IIntStack temp = new IntLinkedList();
	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IIntStack intStack) {
		super(intStack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}

/*
 * Open declaration przechodzi do wybranej deklaracji
 * Quick type hierarchy wyświetla nam hierarchię typu
 * CTRL z myszką wyświetla opcje nawigacji 
 * 
 * Najlepszy będzie IntLinkedList ponieważ mamy nieogarniczone miejsce i nie trzeba przsuwać tablicy
 * */