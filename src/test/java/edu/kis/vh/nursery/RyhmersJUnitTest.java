package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
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
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer(new IntArrayStack());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = ryhmer.isFull();
			Assert.assertEquals(false, result);
			ryhmer.countIn(888);
		}

		boolean result = ryhmer.isFull();
		Assert.assertEquals(true, result);
	}
	/*Powstał podczas robienia punktu 4/5 *
	Konstruktor domyślny DefaultCountingOutRyhmer() używa IntLinkedList, która w metodzie isFull zwraca false, poniewaz
	lista nie ma zmiennej odpowiedzialnej za ilość liczb jaką przechowuje,zatem nigdy nie będzie pełna
	zatem test nie przejdzie ze względu na linie 41/
	 */

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int EMPTY_STACK_VALUE = 0;

		int result = ryhmer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = ryhmer.peekaboo();
		Assert.assertEquals(testValue, result);
	}
	//Powstał podczas wykonywania punktu 11 -> niepoprawna wartość EMPTY_STACK_VALUE
	@Test
	public void testCountOut() {
		DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();
		final int EMPTY_STACK_VALUE = 0;

		int result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		ryhmer.countIn(testValue);

		result = ryhmer.countOut();
		Assert.assertEquals(testValue, result);
		result = ryhmer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	//Błąd powstał podczas wykonywania punktu 11 -> niepoprawna wartość EMPTY_STACK_VALUE
}
