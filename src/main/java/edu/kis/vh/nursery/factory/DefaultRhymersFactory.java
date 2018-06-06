package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.CountingOutRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public CountingOutRhymer getStandardRyhmer() {
        return new CountingOutRhymer();
    }

    @Override
    public CountingOutRhymer getFalseRyhmer() {
        return new CountingOutRhymer();
    }

    @Override
    public CountingOutRhymer getFIFORyhmer() {
        return new FIFORhymer();
    }

    @Override
    public CountingOutRhymer getHanoiRyhmer() {
        return new HanoiRhymer();
    }

}
