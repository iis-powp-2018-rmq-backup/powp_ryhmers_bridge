package edu.kis.vh.nursery;

import java.util.LinkedList;
import java.util.List;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.IntArrayStackRyhmersFactory;
import edu.kis.vh.nursery.factory.IntLinkedListRyhmersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class RhymersDemo {

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		testRyhmes(factory);
		testFactories();
	}

	private static void testRyhmes(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}
	
	private static void testFactories()
	{
		List<RhymersFactory> testFactories = new LinkedList<RhymersFactory>();
		testFactories.add(new DefaultRhymersFactory());
		testFactories.add(new IntArrayStackRyhmersFactory());
		testFactories.add(new IntLinkedListRyhmersFactory());
		
		testFactories.forEach((f) -> {
			RhymersDemo.testRyhmes(f);
		});
	}
	
}