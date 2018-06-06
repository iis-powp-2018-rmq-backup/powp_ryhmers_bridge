package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        CountingOutRhymer ryhmer = new CountingOutRhymer();
        int testValue = 4;
        ryhmer.countIn(testValue);

        int result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        CountingOutRhymer ryhmer = new CountingOutRhymer();
        boolean result = ryhmer.callCheck();
        Assert.assertEquals(true, result);

        ryhmer.countIn(888);

        result = ryhmer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        CountingOutRhymer ryhmer = new CountingOutRhymer();
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
        CountingOutRhymer ryhmer = new CountingOutRhymer();
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
        CountingOutRhymer ryhmer = new CountingOutRhymer();
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
