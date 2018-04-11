/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck1 = new Deck(ranks, suits, values);
		

		// isEmpty works
		System.out.println(deck1.isEmpty());

		// size works
		System.out.println(deck1.size());

		// deal works
		System.out.println(deck1.deal());

		// toString works
		System.out.println(deck1.toString());
	}
}
