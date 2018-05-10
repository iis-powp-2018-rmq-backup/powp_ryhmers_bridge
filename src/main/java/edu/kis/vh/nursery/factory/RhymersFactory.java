package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer getStandardRyhmer();

	public DefaultCountingOutRhymer getFalseRyhmer();

	public DefaultCountingOutRhymer getFIFORyhmer();

	public DefaultCountingOutRhymer getHanoiRyhmer();

}
