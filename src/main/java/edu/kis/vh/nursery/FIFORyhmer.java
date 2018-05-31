package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

	// Z uwagi na to, że typ tej wyliczanki to FIFO wybrałem listę wiązaną
	private final IntStack temp = new IntLinkedList();

	public FIFORyhmer() {
		super();
	}

	public FIFORyhmer(IntStack intStack) {
		super(intStack);
	}

	/**
	 * Bez bicia przyznam się, że nie wiem co to zasada izolacji, ale obstawiłbym, że właśnie w tej metodzie
	 * jest ona złamana. Używany jest tu jednocześnie zbiór elementów z nadklasy jak i tymczasowy zbiór temp
	 * z któego zwracane są dane w przeciążonej metodzie countOut()
	 */

	@Override
	public int countOut() {
		while (!callCheck()) {
			temp.push(super.countOut());
		}

		final int ret = temp.pop();

		while (!temp.isEmpty()) {
			countIn(temp.pop());
		}

		return ret;
	}
}
