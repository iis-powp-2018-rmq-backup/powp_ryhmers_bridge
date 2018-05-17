package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRyhmerTest {

	private DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
	private int EMPTY_STACK_VALUE = 0;

	@Test
	public void testCountInAddsValueToListPeekabooReturnsIt() {
		int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheckReturnsTrueIfEmpty() {
		boolean result = ryhmer.callCheck();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testCallCheckReturnFalseIfNotEmpty() {
		ryhmer.countIn(888);

		boolean result = ryhmer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFullReturnsFalseIfNotFull() {
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}
	}

	@Test
	public void testPeekabooReturnsMinus1WhenEmpty() {
		int result = ryhmer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountOutReturnMinus1WhenEmpty() {
		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountOutPopsLastValue() {
		int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
