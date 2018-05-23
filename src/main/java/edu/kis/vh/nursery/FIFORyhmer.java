package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	private final IntArrayStack temp = new IntArrayStack(); //IntArrayStack bedzie lepszy bo bedzie zajmował mniej miejsca
															//gdyż sklada sie tylko z tablicy , a IntLinkedList dla kazdego argumentu zawiera wartosc oraz wskaik na wczenisjeszy i kolejny elemnet
	
	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(Stack stack) {
		super(stack);
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
