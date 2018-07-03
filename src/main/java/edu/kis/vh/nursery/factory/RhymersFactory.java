package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;

public interface RhymersFactory {

    public CountingOutRhymer getStandardRhymer();

    public CountingOutRhymer getFalseRhymer();

    public CountingOutRhymer getFIFORhymer();

    public CountingOutRhymer getHanoiRhymer();

}
