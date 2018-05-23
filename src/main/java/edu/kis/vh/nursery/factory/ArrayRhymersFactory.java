package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ArrayRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCountingOutRhymer getStandardRyhmer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFalseRyhmer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORyhmer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRyhmer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }
}
//Klasy *Rhymers* i *Rhymer łamią zasadę izolacji. Uważam , że powinniśmy utworzyć dla tych klas wspólny interfejs.