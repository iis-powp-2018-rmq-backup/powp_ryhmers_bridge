package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class DefaultCountingOutRyhmer {
	
	private IntStackInterface intLinkedList;
	//Zmiana ta umożliwia nam dynamiczne podjęcie deczyji, czy wykorzystywać IntLinkedList, czy IntArrayStack
	
	public DefaultCountingOutRyhmer(IntStackInterface intLinkedList) {
		super();
		this.intLinkedList = intLinkedList;}


	public DefaultCountingOutRyhmer() {
		intLinkedList = new IntLinkedList();
	}	

    public int peekaboo() {
        return intLinkedList.top();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    public int getTotal() {
        return intLinkedList.getSize();
    }
}
	
	
	
	//Navigate -> Open Declaration (F3) otwiera deklaracje metod w klasie IntArrayStac}	
