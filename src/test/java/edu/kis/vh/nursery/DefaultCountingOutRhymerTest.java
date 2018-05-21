package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

	DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
	final int EMPTY_STACK_VALUE = -1;
	final int STACK_CAPACITY = 12;

	@Test
	public void testCountInShouldAddTestValueToListAndPeekabooShouldReurnIt() {

		final int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheckShouldReturnTrueIfEmpty() {
		boolean result = ryhmer.callCheck();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testCallCheckShouldReturnTrueIfNotEmpty() {
		ryhmer.countIn(888);

		boolean result = ryhmer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFullShouldReturnFalseIfNotFull() {

		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}
	}

	@Test
	public void testIsFullShouldReturnTrueIfFull() {

		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			ryhmer.countIn(888);
		}

		boolean result = ryhmer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekabooShouldReturnNegativeOneWhenEmpty() {
		int result = ryhmer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testPeekabooShouldReturnTestValueIfNotEmpty() {

		final int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOutShouldReturnNegativeOneWhenEmpty() {
		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

	}

	@Test
	public void testCountOutShouldPopLastValue() {

		final int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

	}

}
