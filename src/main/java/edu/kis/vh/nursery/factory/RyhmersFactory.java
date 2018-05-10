package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
//combination alt+ arrows (left/right) changes view between last used files
public interface RyhmersFactory {

	public DefaultCountingOutRyhmer GetStandardRyhmer();

	public DefaultCountingOutRyhmer GetFalseRyhmer();

	public DefaultCountingOutRyhmer GetFIFORyhmer();

	public DefaultCountingOutRyhmer GetHanoiRyhmer();

}
