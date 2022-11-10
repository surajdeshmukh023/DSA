// Leetcode 977: https://leetcode.com/problems/squares-of-a-sorted-array/
// Time: O(N), Space: O(N) Extra Space
public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] arr = { -4, -1, 0, 3, 10 };
		int[] res = sortedSquares(arr);
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	public static int middlePoint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0)
				return i;
		}
		return arr.length;
	}

	public static int[] sortedSquares(int[] arr) {
		int[] res = new int[arr.length];
		int ptr = 0, right = middlePoint(arr);
		int left = right - 1;

		while (left >= 0 && right < arr.length) {
			if (arr[left] * arr[left] <= arr[right] * arr[right]) {
				res[ptr] = arr[left] * arr[left];
				ptr++;
				left--;
			} else {
				res[ptr] = arr[right] * arr[right];
				ptr++;
				right++;
			}
		}

		while (left >= 0) {
			res[ptr] = arr[left] * arr[left];
			ptr++;
			left--;
		}

		while (right < arr.length) {
			res[ptr] = arr[right] * arr[right];
			ptr++;
			right++;
		}

		return res;
	}

}
