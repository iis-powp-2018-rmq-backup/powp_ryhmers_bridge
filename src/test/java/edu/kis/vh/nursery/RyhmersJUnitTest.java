package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RyhmersJUnitTest {

	@Test
	public void testCountIn() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int testValue = 4;
		ryhmer.countIn(testValue);

		final int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int testValue = 888;
		boolean result = ryhmer.callCheck();
		Assert.assertEquals(true, result);

		ryhmer.countIn(testValue);

		result = ryhmer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		final DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}

		boolean result = ryhmer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		final DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int EMPTY_STACK_VALUE = -1;
		final int testValue = 4;

		int result = ryhmer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		ryhmer.countIn(testValue);

		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;
		final int testValue = 4;

		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		ryhmer.countIn(testValue);

		result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
