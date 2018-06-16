package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;

public interface IRyhmersFactory {
	public DefaultCountingOutRyhmer getStandardRyhmer();
	public DefaultCountingOutRyhmer getFalseRyhmer();
	public DefaultCountingOutRyhmer getFIFORyhmer();
	public DefaultCountingOutRyhmer getHanoiRyhmer();
}
