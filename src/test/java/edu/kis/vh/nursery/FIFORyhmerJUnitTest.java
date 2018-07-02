package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;



public class FIFORyhmerJUnitTest {
	FIFORyhmer ryhmer = new FIFORyhmer();
	final int IS_EMPTY_INDICATOR = -1;

	@Test
	public void testCountOut() {
		int result = ryhmer.countOut();
		Assert.assertEquals(IS_EMPTY_INDICATOR, result);
		
		final int firstValue = 7;
		ryhmer.countIn(firstValue);
		ryhmer.countIn(34);
		
		result = ryhmer.countOut();
		Assert.assertEquals(firstValue, result);
		
		ryhmer.countOut();
		result = ryhmer.countOut();
		Assert.assertEquals(IS_EMPTY_INDICATOR, result);
	}

}