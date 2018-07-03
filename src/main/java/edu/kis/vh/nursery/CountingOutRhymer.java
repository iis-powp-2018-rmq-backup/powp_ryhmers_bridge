package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

// kombinacja klawiszy alt + ← oraz → nawiguje pomiedzy otwartymi klasami
public class CountingOutRhymer {

  private IntLinkedList intLinkedList;

    public CountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public CountingOutRhymer() {
    }

    public static int getEmpty() {
        return IntLinkedList.getEmpty();
    }

    public void push(int i) {
        intLinkedList.push(i);
    }

    public boolean isEmpty() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int top() {
        return intLinkedList.top();
    }

    public int pop() {
        return intLinkedList.pop();
    }


    public void countIn(int in) {
        if (!isFull())
             push(in);
    }


    public boolean callCheck() {
        return isEmpty();
    }


    public int countOut() {
        if (callCheck())
            return getEmpty();
        return pop();
    }



}
