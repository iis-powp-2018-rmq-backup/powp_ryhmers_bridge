package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.factory.Ryhmersfactory;

public class DefaultRyhmersFactory implements Ryhmersfactory {

    @Override
    public DefaultCountingOutRyhmer GetStandardRyhmer() {
        return new DefaultCountingOutRyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer GetFalseRyhmer() {
        return new DefaultCountingOutRyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer GetFIFORyhmer() {
        return new FIFORyhmer();
    }

    @Override
    public DefaultCountingOutRyhmer GetHanoiRyhmer() {
        return new HanoiRyhmer();
    }

}
