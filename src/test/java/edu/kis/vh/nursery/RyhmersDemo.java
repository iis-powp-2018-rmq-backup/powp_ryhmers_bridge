package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersArrayFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.factory.RhymersListFactory;

class RyhmersDemo {

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		RhymersFactory listFactory = new RhymersListFactory();
		RhymersFactory arrayFactory = new RhymersArrayFactory();

		testRhymers(factory);
		testRhymers(listFactory);
		testRhymers(arrayFactory);
	}

	protected static void testRhymers(RhymersFactory factory)
	{
		DefaultCountingOutRhymer[] ryhmers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

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
				+ ((HanoiRhymer) ryhmers[3]).reportRejected());

	}

}