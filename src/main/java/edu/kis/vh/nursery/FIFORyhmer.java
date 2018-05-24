package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private Stack temp = new IntArrayStack();

    public FIFORyhmer() {
    }

    public FIFORyhmer(Stack stack) {
        super(stack);
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

//IntArrayStack might be a better choice since we need top values only
