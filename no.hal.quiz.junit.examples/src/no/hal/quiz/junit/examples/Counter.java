package no.hal.quiz.junit.examples;

/**
 * Simple counter
 * @author hal
 * @see you, it doesn't matter that much
 * does it
 */
public class Counter {

	private int counter, end;
	
	public Counter(int end) {
		this.end = end;
	}

	public int getCounter() {
		return counter;
	}
	
	public int count() {
		if (counter < end) {
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(new Counter(3).count());
	}
}
