package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.defaultCountingOutRyhmer;

public class DefaultRyhmersFactory implements Ryhmersfactory {

    @Override
    public defaultCountingOutRyhmer GetStandardRyhmer() {
        return new defaultCountingOutRyhmer();
    }

    @Override
    public defaultCountingOutRyhmer GetFalseRyhmer() {
        return new defaultCountingOutRyhmer();
    }

    @Override
    public defaultCountingOutRyhmer GetFIFORyhmer() {
        return new FIFORyhmer();
    }

    @Override
    public defaultCountingOutRyhmer GetHanoiRyhmer() {
        return new HanoiRyhmer();
    }

}
