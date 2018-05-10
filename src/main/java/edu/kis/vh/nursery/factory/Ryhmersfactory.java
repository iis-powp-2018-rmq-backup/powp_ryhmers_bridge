package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRyhmer;

public interface Ryhmersfactory {

	public defaultCountingOutRyhmer GetStandardRyhmer();
	
	public defaultCountingOutRyhmer GetFalseRyhmer();
	
	public defaultCountingOutRyhmer GetFIFORyhmer();
	
	public defaultCountingOutRyhmer GetHanoiRyhmer();
	// alt + <- / alt + -> allows the user to switch between classes in the IDE opened by the user
	//(alt + -> - switch to next file opened after the current one, 
	// alt + <- - switch to previous file opened before the current one
}
