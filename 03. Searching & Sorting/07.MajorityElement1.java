
//LC 169: https://leetcode.com/problems/majority-element/
//Time: O(N), Space: O(1) Constant Extra Space
//Moore voting algorithm

public class MajorityElement1 {

	public int majorityElement(int[] nums) {
		int n = nums.length;
		int majority = nums[0], lead = 0;
		int ptr = 0;

		while (ptr < n) {
			if (nums[ptr] == majority) {
				lead++;
			} else if (lead == 0) {
				majority = nums[ptr];
			} else {
				lead--;
			}
			ptr++;
		}

		return majority;
	}

}
