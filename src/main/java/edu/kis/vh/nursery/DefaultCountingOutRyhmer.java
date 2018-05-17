package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class DefaultCountingOutRyhmer {
	  
	//proba implementacji zadania 4 
	IntLinkedList list=new IntLinkedList();
	//
	
	IntArrayStack arrayStack;
   //konstruktor zwykly wygenerowany z Source->Generate Constructor
	public DefaultCountingOutRyhmer(IntArrayStack arrayStack) {
		super();
		this.arrayStack = arrayStack;
	}
	
	//konstruktor domyslny 
	public DefaultCountingOutRyhmer() {
		this.arrayStack = new IntArrayStack();
	}
    //wygenerowane delegeted methods 
	public int getTotal() {
		return arrayStack.getTotal();
	}

	public void countIn(int in) {
		arrayStack.countIn(in);
	}
	
	//stara implementacja 
   /*
	private static final int EMPTY_VALUE = -1;

	private static final int MAX_CAPACITy = 12;

	private final int[] numbers = new int[MAX_CAPACITy]; //12 raczej nie nazywac SIZE !!! raczej capacity !!!

	private int total = EMPTY_VALUE; //value if empty 

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY_VALUE;
	}

	protected boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total--];
	}*/

}
