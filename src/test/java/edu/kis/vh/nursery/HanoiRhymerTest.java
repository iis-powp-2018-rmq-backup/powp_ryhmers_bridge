package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

	private HanoiRhymer rhymer = new HanoiRhymer();
	final int EMPTY_STACK_VALUE = -1;

	@Test
	public void testCountInShouldNotReportRejectedOnlyWhenNotEmpty() {
		rhymer.countIn(10);
		int rejectedCount = rhymer.reportRejected();
		Assert.assertEquals(0, rejectedCount);
	}

	@Test
	public void testCountInShouldNotReportRejectedWhenEmpty() {
		int rejectedCount = rhymer.reportRejected();
		Assert.assertEquals(0, rejectedCount);
	}

	@Test
	public void testCountInShouldReportTwoRejectedWhenNotEmptyAndTwoInputBiggerThanLastValueAdded() {
		rhymer.countIn(10);
		rhymer.countIn(100);
		rhymer.countIn(101);
		int rejectedCount = rhymer.reportRejected();
		Assert.assertEquals(2, rejectedCount);
	}

	@Test
	public void testCountInShouldReportOneRejectedWhenNotEmptyAndAddedSmallBigSmallestValue() {
		rhymer.countIn(10);
		rhymer.countIn(101);
		rhymer.countIn(1);
		int rejectedCount = rhymer.reportRejected();
		Assert.assertEquals(1, rejectedCount);
	}
}
