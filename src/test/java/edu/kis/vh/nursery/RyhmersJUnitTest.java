package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class RyhmersJUnitTest {

	@Test
	public void testCountIn() {
		IntArrayStack ryhmer = new IntArrayStack();
		int testValue = 4;
		ryhmer.push(testValue);

		int result = ryhmer.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStack ryhmer = new IntArrayStack();
		boolean result = ryhmer.isEmpty();
		Assert.assertEquals(true, result);

		ryhmer.push(888);

		result = ryhmer.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.push(888);
		}

		boolean result = ryhmer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

		int result = ryhmer.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.push(testValue);

		result = ryhmer.top();
		Assert.assertEquals(testValue, result);
		result = ryhmer.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack ryhmer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

		int result = ryhmer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.push(testValue);

		result = ryhmer.pop();
		Assert.assertEquals(testValue, result);
		result = ryhmer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
