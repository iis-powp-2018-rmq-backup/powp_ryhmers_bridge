package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRyhmerTest {

	private HanoiRyhmer ryhmer = new HanoiRyhmer();

	@Test
	public void testCountInDoesNotReportsRejectedOnlyWhenNotEmpty(){
		ryhmer.countIn(10);
		int rejectedCount = ryhmer.reportRejected();
		Assert.assertEquals(0, rejectedCount);
	}

	@Test
	public void testCountInDoesNotReportsRejectedWhenEmpty(){
		int rejectedCount = ryhmer.reportRejected();
		Assert.assertEquals(0, rejectedCount);
	}

	@Test
	public void testCountInReportsTwoRejectedWhenNotEmptyAndTwoInputBiggerThanLastValueAdded(){
		ryhmer.countIn(10);
		ryhmer.countIn(100);
		ryhmer.countIn(200);
		int rejectedCount = ryhmer.reportRejected();
		Assert.assertEquals(2, rejectedCount);
	}

	@Test
	public void testCountInReportsOneRejectedWhenNotEmptyAndAddedSmallBigSmallestValue(){
		ryhmer.countIn(10);
		ryhmer.countIn(100);
		ryhmer.countIn(5);
		int rejectedCount = ryhmer.reportRejected();
		Assert.assertEquals(1, rejectedCount);
	}
}
