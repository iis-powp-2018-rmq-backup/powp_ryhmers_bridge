package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRyhmer;
//combination alt+ arrows (left/right) changes view between last used files
public interface Ryhmersfactory {

	public defaultCountingOutRyhmer GetStandardRyhmer();

	public defaultCountingOutRyhmer GetFalseRyhmer();

	public defaultCountingOutRyhmer GetFIFORyhmer();

	public defaultCountingOutRyhmer GetHanoiRyhmer();

}
