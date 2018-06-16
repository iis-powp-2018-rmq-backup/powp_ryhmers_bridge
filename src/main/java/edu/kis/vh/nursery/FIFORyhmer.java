package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IStackImplementation;
import edu.kis.vh.nursery.stack.IntArrayStack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {


	public FIFORyhmer () {
		list = new IntArrayStack();
		// IntArrayStack - szybszy (sekwencyjny) dostęp do danych
		// Dużo większa szansa na przeniesienie do pamięci Cache CPU (w przeciwieństwie do IntLinkedList)
		// Oszczędność pamięci.
	}

	public FIFORyhmer (IStackImplementation stackImplementation)
    {
    	super(stackImplementation);
    }

	@Override
	public int countOut() {
		int returnCountOut;
		while (!callCheck()) {
			list.push(super.countOut());
		}

		returnCountOut = list.pop();

		while (!list.isEmpty()) {
			countIn(list.pop());
		}

		return returnCountOut;
	}
}
/* Sprawdzenie działanie skrótu alt+/ */
/* Skrót klawiszowy alt + wybrana strzałka odpowiada za przejście między edytowanymi elementami.*/