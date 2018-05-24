package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stack;

public class DefaultCountingOutRyhmer {

    private Stack stack;

    public DefaultCountingOutRyhmer() {
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRyhmer(Stack stack) {
        this.stack = stack;
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }

    public int getTotal() {
        return stack.getTotal();
    }
}

//Alt + left/right arrow switches between opened files
//F3 (Or CTRL + B in IntelliJ) shows declaration of used method

//Using Stack interface in constructor, instead of concrete classes lets utilize them interchangeably
//without changing content of this class every time we want to use another implementation

//All classes from this hierarchy break the isolation rule. Solution is to create common interface of these.