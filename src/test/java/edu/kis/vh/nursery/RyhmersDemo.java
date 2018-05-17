package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.factory.DefaultRyhmersFactory;
import edu.kis.vh.nursery.factory.RyhmersFactory;

class RyhmersDemo {

	public static void main(String[] args) {
		RyhmersFactory factory = new DefaultRyhmersFactory();
		
		testRyhmers(factory);
		
	}

	private static void testRyhmers(RyhmersFactory factory) {
		DefaultCountingOutRyhmer[] ryhmers = { factory.getStandardRyhmer(), factory.getFalseRyhmer(),
				factory.getFIFORyhmer(), factory.getHanoiRyhmer()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				ryhmers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			ryhmers[3].countIn(rn.nextInt(20));
		
		for (int i = 0; i < ryhmers.length; i++) {
			while (!ryhmers[i].callCheck())
				System.out.print(ryhmers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRyhmer) ryhmers[3]).reportRejected());
	}
	
}