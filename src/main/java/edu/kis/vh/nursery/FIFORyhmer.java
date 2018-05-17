package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private final IntStackInterface  temp = new IntArrayStack();

    public FIFORyhmer(IntStackInterface list) {
        super(list);
    }

    public FIFORyhmer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        final int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}

//Best option is IntArrayStack as in temp we only need the latest
//value so less memory is being occupied