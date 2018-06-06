package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;

public interface RhymersFactory {

    public CountingOutRhymer getStandardRyhmer();

    public CountingOutRhymer getFalseRyhmer();

    public CountingOutRhymer getFIFORyhmer();

    public CountingOutRhymer getHanoiRyhmer();

}
