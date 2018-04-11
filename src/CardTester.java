/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("9", "Spades", 9);
		Card card2 = new Card("Jack", "Hearts", 11);
		Card card3 = new Card("9", "Spades", 9);

		System.out.println(card1.rank()); // 9
		System.out.println(card2.suit()); // Hearts
		System.out.println(card3.pointValue()); // 9
		System.out.println(card1.matches(card3)); // True
		System.out.println(card1.matches(card2)); // False
		System.out.println(card2.toString()); // Jack of Hearts (point value = 11)
	}
}
