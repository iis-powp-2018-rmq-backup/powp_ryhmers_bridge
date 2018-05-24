package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRyhmersFactory implements RhymersFactory {

    @Override
    public DefaultCountingOutRhymer getStandardRyhmer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRyhmer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORyhmer() {
        return new FIFORyhmer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRyhmer() {
        return new HanoiRyhmer();
    }

}
