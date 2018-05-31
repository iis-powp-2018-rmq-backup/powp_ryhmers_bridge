package edu.kis.vh.nursery.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntLinkedListJUnitTest {

	@Test
	public void testPush() {
		final IntLinkedList testLinkedList = new IntLinkedList();
		final int testValue = 10;
		testLinkedList.push(testValue);
		final int result = testLinkedList.pop();
		assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		final IntLinkedList testLinkedList = new IntLinkedList();
		final int testValue = -1;
		assertEquals(true, testLinkedList.isEmpty());
		testLinkedList.push(testValue);
		assertEquals(false, testLinkedList.isEmpty());
		testLinkedList.pop();
		assertEquals(true, testLinkedList.isEmpty());
	}

	@Test
	public void testTop() {
		final IntLinkedList testLinkedList = new IntLinkedList();
		final int testValue = -1;

		assertEquals(IntLinkedList.STACK_EMPTY, testLinkedList.top());

		testLinkedList.push(testValue);
		assertNotEquals(IntLinkedList.STACK_EMPTY, testLinkedList.top());
		assertEquals(testValue, testLinkedList.top());

		testLinkedList.pop();
		assertEquals(IntLinkedList.STACK_EMPTY, testLinkedList.top());
	}

	@Test
	public void testPop() {
		final IntLinkedList testLinkedList = new IntLinkedList();
		final int testValue = -1;

		assertEquals(IntLinkedList.STACK_EMPTY, testLinkedList.pop());

		testLinkedList.push(testValue);
		int result = testLinkedList.pop();

		assertNotEquals(IntLinkedList.STACK_EMPTY, result);
		assertEquals(testValue, result);

		assertEquals(IntLinkedList.STACK_EMPTY, testLinkedList.top());
	}
}