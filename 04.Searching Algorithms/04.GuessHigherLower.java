
//https://leetcode.com/problems/guess-number-higher-or-lower/  374. Guess Number Higher or Lower
//Time = O(log2 N), Space = O(1)
public class GuessHigherLower {

	public int guessNumber(int n) {
		int left = 1, right = n;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int choice = guess(mid);

			if (choice == 0)
				return mid;
			else if (choice == 1)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1;
	}

	private int guess(int mid) {
		return 0;
	}

}
