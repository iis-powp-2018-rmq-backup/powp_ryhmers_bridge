package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRyhmer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRyhmer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORyhmer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRyhmer() {
		return new HanoiRhymer();
	}

}
