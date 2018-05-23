package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntContainer;

public class DefaultCountingOutRyhmer {
	
	
	private IntContainer intcontainer;
   //konstruktor zwykly wygenerowany z Source->Generate Constructor
	public DefaultCountingOutRyhmer(IntContainer arrayStack) {
		super();
		this.intcontainer = arrayStack;
	}
	
	//konstruktor domyslny 
	public DefaultCountingOutRyhmer() {
		this.intcontainer = new IntArrayStack();
	}
    //wygenerowane delegeted methods 
	public int getTotal() {
		return intcontainer.getTotal();
	}

	public void countIn(int in) {
		intcontainer.countIn(in);
	}

	public boolean callCheck() {
		return intcontainer.callCheck();
	}

	public boolean isFull() {
		return intcontainer.isFull();
	}

	public int peekaboo() {
		return intcontainer.peekaboo();
	}

	public int countOut() {
		return intcontainer.countOut();
	}

}
