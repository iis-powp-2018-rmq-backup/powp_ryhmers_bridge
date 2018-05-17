package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();

}

/*
 * Kombinacja klawiszy alt+-> alt+<- pozwala na przełączanie się między plikami
 */