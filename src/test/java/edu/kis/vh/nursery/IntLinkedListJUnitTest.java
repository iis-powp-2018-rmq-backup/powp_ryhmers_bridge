package edu.kis.vh.nursery;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;

public class IntLinkedListJUnitTest {
	private final static boolean EMPTY = true;
	private IntLinkedList objectUnderTest = null;

	@Test
	public void testIsEmpty() {
		objectUnderTest = new IntLinkedList();
		assertEquals(EMPTY, objectUnderTest.isEmpty());
	}
	
	@Test
	public void testPush() {
		objectUnderTest = new IntLinkedList();
		int expectedValue = 10;
		objectUnderTest.push(expectedValue);
		assertEquals(!EMPTY, objectUnderTest.isEmpty());
	}

	@Test
	public void testTop() {
		objectUnderTest = new IntLinkedList();
		int expectedValue = 10;
		objectUnderTest.push(expectedValue);
		assertEquals(expectedValue, objectUnderTest.top());
		assertEquals(!EMPTY, objectUnderTest.isEmpty());
	}

	@Test
	public void testPop() {
		objectUnderTest = new IntLinkedList();
		int expectedValue = 10;
		objectUnderTest.push(expectedValue);
		assertEquals(expectedValue, objectUnderTest.top());
		assertEquals(!EMPTY, objectUnderTest.isEmpty());
	}

}