package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.intType.IntArrayStack;
import edu.kis.vh.nursery.collections.intType.IntLinkedList;
import edu.kis.vh.nursery.factory.Ryhmersfactory;

public class RyhmerFactoryImpl implements Ryhmersfactory {

	@Override
	public DefaultCountingOutRyhmer getStandardRyhmer() {
		return new FIFORyhmer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRyhmer getFalseRyhmer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DefaultCountingOutRyhmer getFIFORyhmer() {
		return new FIFORyhmer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRyhmer getHanoiRyhmer() {
		// TODO Auto-generated method stub
		return new HanoiRyhmer(new IntArrayStack());
	}
	
	public static FIFORyhmer createArrayStackRyhmer() {
		return new FIFORyhmer(new IntArrayStack());
	}
	
	public static FIFORyhmer createListStackRyhmer() {
		return new FIFORyhmer(new IntLinkedList());
	}
}
