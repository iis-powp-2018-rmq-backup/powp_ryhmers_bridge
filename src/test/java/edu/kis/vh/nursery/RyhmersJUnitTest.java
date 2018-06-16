package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RyhmersJUnitTest {

    private static int testValue = 4;
    private int EMPTY_STACK_VALUE = -1;
    private final int STACK_CAPACITY = 12;
	private DefaultCountingOutRyhmer ryhmer;

	@Before
	public void setDefaultCountingOutRyhmerBeforeSimpleTest() {
		ryhmer = new DefaultCountingOutRyhmer();
	}

    @Test
	public void testCountIn() {
		ryhmer.countIn(testValue);
		Assert.assertEquals(testValue, ryhmer.peekaboo());
	}

	@Test
	public void testCallCheck() {
		Assert.assertTrue(ryhmer.callCheck());
		ryhmer.countIn(888);
		Assert.assertFalse(ryhmer.callCheck());
	}

	@Test
	public void testIsFull() {
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse( ryhmer.isFull());
			ryhmer.countIn(888);
		}

		Assert.assertTrue( ryhmer.isFull());
	}

	@Test
	public void testPeekaboo() {
		Assert.assertEquals(EMPTY_STACK_VALUE, ryhmer.peekaboo());
		ryhmer.countIn(testValue);
		Assert.assertEquals(testValue, ryhmer.peekaboo());
		Assert.assertEquals(testValue, ryhmer.peekaboo());
	}

	@Test
	public void testCountOut() {
		Assert.assertEquals(EMPTY_STACK_VALUE, ryhmer.countOut());
		ryhmer.countIn(testValue);
		Assert.assertEquals(testValue, ryhmer.countOut());
		Assert.assertEquals(EMPTY_STACK_VALUE, ryhmer.countOut());
	}

}