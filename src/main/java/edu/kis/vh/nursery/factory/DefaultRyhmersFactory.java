package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;


public class DefaultRyhmersFactory implements Ryhmersfactory {

    @Override
    public DefaultCountingOutRyhmer getStandardRyhmer() {
        return new DefaultCountingOutRyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer getFalseRyhmer() {
        return new DefaultCountingOutRyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer getFIFORyhmer() {
        return new FIFORyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer getHanoiRyhmer() {
        return new HanoiRyhmer();
    }

}
