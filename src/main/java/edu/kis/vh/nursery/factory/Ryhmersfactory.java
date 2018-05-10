package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRyhmer;

public interface Ryhmersfactory {

	public defaultCountingOutRyhmer GetStandardRyhmer();

	public defaultCountingOutRyhmer GetFalseRyhmer();

	public defaultCountingOutRyhmer GetFIFORyhmer();

	public defaultCountingOutRyhmer GetHanoiRyhmer();

//Kombinacje klawiszy alt + ← oraz alt + →, pozwalają przechodzic pomiedzy ostatnio modyfikowanymi klasami
}
