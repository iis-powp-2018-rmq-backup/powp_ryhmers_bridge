package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer getStandardRhymer();
	
	public DefaultCountingOutRhymer getFalseRhymer();
	
	public DefaultCountingOutRhymer getFIFORhymer();
	
	public DefaultCountingOutRhymer getHanoiRhymer();
	// alt + <- / alt + -> allows the user to switch between classes in the IDE opened by the user
	//(alt + -> - switch to next file opened after the current one, 
	// alt + <- - switch to previous file opened before the current one
}
