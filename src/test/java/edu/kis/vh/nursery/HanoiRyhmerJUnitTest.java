package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRyhmerJUnitTest {
	HanoiRyhmer ryhmer = new HanoiRyhmer();
	@Test
	public void testCountIn() {
		ryhmer.countIn(2);
		ryhmer.countIn(3);
		Assert.assertEquals(1, ryhmer.reportRejected());
		
		int result = ryhmer.peekaboo();
		Assert.assertEquals(result, 2);
		
	}

}