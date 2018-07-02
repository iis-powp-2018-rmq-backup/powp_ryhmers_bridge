package edu.kis.vh.nursery;

import javax.xml.bind.annotation.XmlEnumValue;

import edu.kis.vh.nursery.stack.Stack;

/**
 * Hanoi Ryhmer
 * 
 * @author Kuba Sawicki
 */
public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	public HanoiRyhmer() {
		super();
	}

	public HanoiRyhmer(Stack stack) {
		super(stack);
	}

	private int totalRejected = 0;

	/**
	 * returns rejected numbers from Ryhmer
	 * @return
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/* 
	 * Places given number in Ryhmer
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
