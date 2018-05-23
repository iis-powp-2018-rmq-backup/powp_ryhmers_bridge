package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

import java.util.ArrayList;
import java.util.List;

class RhymersDemo {

	public static void main(String[] args) {
		List<Rhymersfactory> rhymersfactories = new ArrayList<>();
		rhymersfactories.add(new DefaultRhymersFactory());
		rhymersfactories.add(new ArrayRhymersFactory());
		rhymersfactories.add(new ListRhymersFactory());
		for(Rhymersfactory rhymersfactory : rhymersfactories){
			testRhymers(rhymersfactory);
		}
	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] ryhmers = { factory.getStandardRyhmer(), factory.getFalseRyhmer(),
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
				+ ((HanoiRhymer) ryhmers[3]).reportRejected());
	}

}