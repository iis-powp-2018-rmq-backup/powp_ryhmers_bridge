package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;

public interface RyhmersFactory {

    DefaultCountingOutRyhmer getStandardRyhmer();

    DefaultCountingOutRyhmer getFalseRyhmer();

    DefaultCountingOutRyhmer getFIFORyhmer();

    DefaultCountingOutRyhmer getHanoiRyhmer();

}
