package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RyhmersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		int testValue = 4;
		ryhmer.countIn(testValue);

		int result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		boolean result = ryhmer.callCheck();
		Assert.assertEquals(true, result);

		ryhmer.countIn(888);

		result = ryhmer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int stackCapacity = 12;
		for (int i = 0; i < stackCapacity; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int emptyStackValue = -1;

		int result = ryhmer.peekaboo();
		Assert.assertEquals(emptyStackValue, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int emptyStackValue = -1;

		int result = ryhmer.countOut();
		Assert.assertEquals(emptyStackValue, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(emptyStackValue, result);
	}

}
