package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stack;

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

    /*Dzięki zastosowaniu interfejsu nie jesteśmy zależni od konkretnej implementacji IntLinkedList/IntArrayStack
      co sprawia, że możemy dynamiczne używać kolekcji/napisanych przez nas klas, które by implementowały Interfejs Stack
    */

    /*18.
    Wszystkie klasy (DefaultCountingOutRhymer,FIFORyhmer,HanoiRyhmer) łamią tę zasadę, ponieważ
    żadne z nich nie posiada wspólnej abstrakcji, a co za tym idzie używając każdej z nich musimy się odwoływać do konkretnej implementacji.
    Można to naprawić poprzez wydzielenie wspólnego interfejsu dla tych klas.
     */

}
