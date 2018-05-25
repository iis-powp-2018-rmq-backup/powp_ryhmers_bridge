package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RyhmersJUnitTest {
    private final int EMPTY_STACK_VALUE = -1;
    private final int STACK_CAPACITY = 12;
    private final int testValue = 4;
    private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    @Test
    public void testCountInPeekabooReturnsAddedValue() {
        rhymer.countIn(testValue);
        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheckReturnsTrueIfEmpty() {
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testIsFullReturnsFalseIfNotFull() {
        for (int i = 0; i < STACK_CAPACITY; i++) {
            final boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }
    }

    @Test
    public void testPeekabooReturnsEmptyStackValueIfEmpty() {
        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testCountOutReturnsEmptyStackValueIfEmpty() {
        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
// alt+right/left arrow - Expand selection to next / previous element
