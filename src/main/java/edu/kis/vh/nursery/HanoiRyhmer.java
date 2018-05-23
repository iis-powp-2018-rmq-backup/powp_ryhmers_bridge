package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

/**
 * The HanoiRyhmer class is special type of DefaultCountingOutRyhmer
 * @author rafal
 */
public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

	public HanoiRyhmer() {
	}

	public HanoiRyhmer(Stackable list) {
		super(list);
	}

	/**
	 * @return	the total rejected elements
	 */
	public int reportRejected() {
		return totalRejected;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
