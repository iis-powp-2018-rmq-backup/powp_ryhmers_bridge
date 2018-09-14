package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class ArrayStackRhymersFactory implements RhymersFactory {
    @Override
    public CountingOutRhymer getStandardRhymer() {
        return new CountingOutRhymer();
    }

    public CountingOutRhymer getFalseRhymer() {
        return new CountingOutRhymer();
    }

    @Override
    public CountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public CountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}
