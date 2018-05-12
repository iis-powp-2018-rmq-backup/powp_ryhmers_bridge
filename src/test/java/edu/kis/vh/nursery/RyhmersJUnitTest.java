package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RyhmersJUnitTest {

    private final int testValue = 4;
    private final DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();

    @Test
    public void testCountIn() {
        ryhmer.countIn(testValue);

        final int result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        boolean result = ryhmer.callCheck();
        Assert.assertEquals(true, result);
        ryhmer.countIn(888);

        result = ryhmer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            final boolean result = ryhmer.isFull();
            Assert.assertEquals(false, result);
            ryhmer.countIn(888);
        }

        final boolean result = ryhmer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        final int EMPTY_STACK_VALUE = -1;

        int result = ryhmer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        ryhmer.countIn(testValue);

        result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        final int EMPTY_STACK_VALUE = -1;

        int result = ryhmer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        ryhmer.countIn(testValue);

        result = ryhmer.countOut();
        Assert.assertEquals(testValue, result);
        result = ryhmer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
// alt+right/left arrow - Expand selection to next / previous element
