package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aghero on 16.05.2018.
 */
public class DefaultRhymersFactoryTest {
    @Test
    public void getStandardRhymer() throws Exception {
        DefaultRhymersFactory test = new DefaultRhymersFactory();
        boolean result = test.getStandardRhymer() != null;

        Assert.assertEquals(true, result);
    }

    @Test
    public void getFalseRhymer() throws Exception {
        DefaultRhymersFactory test = new DefaultRhymersFactory();
        boolean result = test.getFalseRhymer() != null;

        Assert.assertEquals(true, result);
    }

    @Test
    public void getFIFORhymer() throws Exception {
        DefaultRhymersFactory test = new DefaultRhymersFactory();
        boolean result = test.getFIFORhymer() != null;

        Assert.assertEquals(true, result);
    }

    @Test
    public void getHanoiRhymer() throws Exception {
        DefaultRhymersFactory test = new DefaultRhymersFactory();
        boolean result = test.getHanoiRhymer() != null;

        Assert.assertEquals(true, result);
    }

}