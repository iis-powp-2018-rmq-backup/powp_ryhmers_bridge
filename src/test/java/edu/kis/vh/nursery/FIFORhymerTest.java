package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {

	private FIFORhymer rhymer = new FIFORhymer();
	final int EMPTY_STACK_VALUE = -1;

	@Test
	public void testCountOutShouldReturnNegativeOneWhenRhymerIsEmpty() {

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountOutShouldReturnTestValueWhenOneAdded() {
		int testValue = 23;
		rhymer.countIn(testValue);
		int result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOutShouldReturnTestValuesFIFOWhenTwoAdded() {
		int startingTestValue = 10;
		rhymer.countIn(startingTestValue);
		rhymer.countIn(15);

		int result = rhymer.countOut();
		Assert.assertEquals(startingTestValue, result);

		rhymer.countOut();
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

	}
}
