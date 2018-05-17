package edu.kis.vh.nursery;

/**
 * The HanoiRyhmer class is special type of DefaultCountingOutRyhmer
 * @author rafal
 */
public class HanoiRyhmer extends DefaultCountingOutRyhmer {

	private int totalRejected = 0;

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
