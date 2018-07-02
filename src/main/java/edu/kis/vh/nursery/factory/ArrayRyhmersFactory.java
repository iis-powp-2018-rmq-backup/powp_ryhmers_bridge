package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ArrayRyhmersFactory implements Ryhmersfactory {

	@Override
	public DefaultCountingOutRyhmer getStandardRyhmer() {
		return new DefaultCountingOutRyhmer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRyhmer getFalseRyhmer() {
		return new DefaultCountingOutRyhmer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRyhmer getFIFORyhmer() {
		return new FIFORyhmer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRyhmer getHanoiRyhmer() {
		return new HanoiRyhmer(new IntArrayStack());
	}

}