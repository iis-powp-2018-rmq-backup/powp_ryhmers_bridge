package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.defaultCountingOutRyhmer;

	public interface Ryhmersfactory {
	
		public DefaultCountingOutRyhmer GetStandardRyhmer();
		
		public DefaultCountingOutRyhmer GetFalseRyhmer();
		
		public DefaultCountingOutRyhmer GetFIFORyhmer();
		
		public DefaultCountingOutRyhmer GetHanoiRyhmer();
		
	}
