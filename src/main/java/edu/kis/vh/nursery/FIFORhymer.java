package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.Stack;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private Stack temp = new IntLinkedList();
	
	public FIFORhymer(){
	
	}
	public FIFORhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int countOut() {
		while (!callCheck())

			temp.push(super.countOut());

		final int ret = temp.pop();

		while (!temp.isEmpty())

			countIn(temp.pop());

		return ret;
	}
}

//IntLinkedList should be better, because of unlimited space