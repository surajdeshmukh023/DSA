
//leetcode 704: 

//https://leetcode.com/problems/binary-search/description/

//Time = O(Log2 N), Space = O(1) Inplace

public class BinarySeach {

	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = (start + end) / 2;
		while (start <= end) {
			if (nums[mid] == target)
				return mid;

			if (target > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		return -1; // unsuccessful search
	}

}
