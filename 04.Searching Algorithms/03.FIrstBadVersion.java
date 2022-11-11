
//https://leetcode.com/problems/first-bad-version/description/  278. First Bad Version
//Time = O(Log2 N), Space = O(1)
public class FIrstBadVersion {

	public static boolean isBadVersion(int n) {
		return false;
	}

	public int firstBadVersion(int n) {
		int left = 1, right = n;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid) == false) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return left;
	}
}
