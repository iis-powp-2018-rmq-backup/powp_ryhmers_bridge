package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORyhmerTest {

	private FIFORyhmer ryhmer = new FIFORyhmer();

	@Test
	public void testCountOutReturnsMinus1WhenRyhmersEmpty() {
		int EMPTY_STACK_VALUE = 0;
		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountOutReturnsValueWhenOneAdded() {
		int testValue = 88;
		ryhmer.countIn(testValue);
		int result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOutReturnsValuesFIFOWhenFiveAdded() {
		int startingValue = 88;
		for(int i = 0; i < 5; i++){
			int testValue = startingValue + i;
			ryhmer.countIn(testValue);
		}

		for(int i = 0; i < 5; i++) {
			int testValue = startingValue + i;
			int result = ryhmer.countOut();
			Assert.assertEquals(testValue, result);
		}
	}
}
