package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRyhmer;

public interface RyhmersFactory {

    public CountingOutRyhmer getStandardRyhmer();

    public CountingOutRyhmer getFalseRyhmer();

    public CountingOutRyhmer getFIFORyhmer();

    public CountingOutRyhmer getHanoiRyhmer();

}
