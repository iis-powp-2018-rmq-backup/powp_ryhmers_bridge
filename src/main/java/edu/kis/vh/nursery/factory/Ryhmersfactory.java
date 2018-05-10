package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Ryhmersfactory {

    public defaultCountingOutRhymer getStandardRhymer();

    public defaultCountingOutRhymer getFalseRhymer();

    public defaultCountingOutRhymer getFIFORhymer();

    public defaultCountingOutRhymer getHanoiRhymer();

}
