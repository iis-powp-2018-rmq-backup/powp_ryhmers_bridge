package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.factory.StackRhymersFactory;

class RyhmersDemo {

    public static void main(String[] args) {
        
        testRhymerFactories(new DefaultRhymersFactory());
        testRhymerFactories(new ListRhymersFactory());
        testRhymerFactories(new StackRhymersFactory());

    }

    public static void testRhymerFactories(RhymersFactory factory) {

        DefaultCountingOutRhymer[] ryhmers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
            factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                ryhmers[j].countIn(i);
            }
        }

        java.util.Random randomNum = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            ryhmers[3].countIn(randomNum.nextInt(20));
        }

        for (int i = 0; i < ryhmers.length; i++) {
            while (!ryhmers[i].callCheck()) {
                System.out.print(ryhmers[i].countOut() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRyhmer) ryhmers[3]).reportRejected());
    }

}
