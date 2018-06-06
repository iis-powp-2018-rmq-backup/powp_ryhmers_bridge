package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.CountingOutRyhmer;

public class DefaultRyhmersFactory implements RyhmersFactory {

    @Override
    public CountingOutRyhmer getStandardRyhmer() {
        return new CountingOutRyhmer();
    }

    @Override
    public CountingOutRyhmer getFalseRyhmer() {
        return new CountingOutRyhmer();
    }

    @Override
    public CountingOutRyhmer getFIFORyhmer() {
        return new FIFORyhmer();
    }

    @Override
    public CountingOutRyhmer getHanoiRyhmer() {
        return new HanoiRyhmer();
    }

}
