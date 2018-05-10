package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRyhmer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFalseRyhmer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFIFORyhmer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRyhmer() {
		return new HanoiRhymer();
	}

}
