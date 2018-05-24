package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.Stack;
import edu.kis.vh.nursery.factory.ArrayRyhmersFactory;
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
		//Since the default collection in DefaultCountingOutRyhmer is IntLinkedList,
		//which doesn't have any fixed capacity, we should test IntArrayStack instead.
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer(new IntArrayStack());
		final int STACK_CAPACITY = 12;
		//We need to fix this loop condition because we don't want to fill the stack completely
		//before asserting if it's empty.
		for (int i = 0; i < STACK_CAPACITY - 1; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}

		boolean result = ryhmer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int EMPTY_STACK_VALUE = Stack.DEFAULT_EMPTY_STACK_VALUE;

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
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int EMPTY_STACK_VALUE = Stack.DEFAULT_EMPTY_STACK_VALUE;

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
