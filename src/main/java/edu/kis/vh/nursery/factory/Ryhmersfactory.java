package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;

	public interface Ryhmersfactory {
	
		DefaultCountingOutRyhmer GetStandardRyhmer();
		
		DefaultCountingOutRyhmer GetFalseRyhmer();
		
		DefaultCountingOutRyhmer GetFIFORyhmer();
		
		DefaultCountingOutRyhmer GetHanoiRyhmer();
		
	}
