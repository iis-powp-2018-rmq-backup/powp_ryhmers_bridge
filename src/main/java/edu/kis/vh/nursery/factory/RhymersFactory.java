package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
//combination alt+ arrows (left/right) changes view between last used files
public interface RhymersFactory {

	public DefaultCountingOutRhymer GetStandardRyhmer();

	public DefaultCountingOutRhymer GetFalseRyhmer();

	public DefaultCountingOutRhymer GetFIFORyhmer();

	public DefaultCountingOutRhymer GetHanoiRyhmer();

}
