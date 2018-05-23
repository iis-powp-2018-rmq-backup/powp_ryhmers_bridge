package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

    DefaultCountingOutRhymer getStandardRyhmer();

    DefaultCountingOutRhymer getFalseRyhmer();

    DefaultCountingOutRhymer getFIFORyhmer();

    DefaultCountingOutRhymer getHanoiRyhmer();

}
// 3.1.16 wzorzec - fabryka abstrakcyjna (abstract factory)