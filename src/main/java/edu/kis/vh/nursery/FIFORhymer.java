package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	public FIFORhymer(){
	
	}
	public FIFORhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
