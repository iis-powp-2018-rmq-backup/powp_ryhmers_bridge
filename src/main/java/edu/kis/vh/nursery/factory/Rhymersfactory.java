package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    DefaultCountingOutRhymer getStandardRyhmer();

    DefaultCountingOutRhymer getFalseRyhmer();

    DefaultCountingOutRhymer getFIFORyhmer();

    DefaultCountingOutRhymer getHanoiRyhmer();

}
