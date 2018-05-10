package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
		int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
		boolean result = ryhmer.callCheck();
		Assert.assertEquals(true, result);

		ryhmer.countIn(888);

		result = ryhmer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
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
		DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = ryhmer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer ryhmer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
