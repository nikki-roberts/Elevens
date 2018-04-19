public class Questions {

	public static boolean flip() {
		int flip = Math.random() * 1);
		// heads is true tails is false
		return (flip > 0.33);
	}

	public static boolean arePermutations(int a[], int b[]) {
		boolean found = false;
		for (int i=0; i<a.length; i++) {
			found = false;

			for (int j=0; j<b.length; j++) {
				if (a[i] == b[j]) {
					found = true;
				}
			}

			if (!found) {
				return false;
			}

		}
		return true;
	}

}

// Question 3: 
//		Random integers 0, 1, 2, 3