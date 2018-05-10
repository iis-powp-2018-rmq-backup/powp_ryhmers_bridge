package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;

public interface Ryhmersfactory {

	public DefaultCountingOutRyhmer getStandardRyhmer();

	public DefaultCountingOutRyhmer getFalseRyhmer();

	public DefaultCountingOutRyhmer getFIFORyhmer();

	public DefaultCountingOutRyhmer getHanoiRyhmer();

//Kombinacje klawiszy alt + ← oraz alt + →, pozwalają przechodzic pomiedzy ostatnio modyfikowanymi klasami
}
