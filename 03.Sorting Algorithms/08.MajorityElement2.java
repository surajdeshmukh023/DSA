
import java.util.ArrayList;
import java.util.List;

//LC 229: https://leetcode.com/problems/majority-element-ii/
//Time: O(N), Space: O(1) Constant Extra Space
//Moore voting algorithm

class Solution {

	public static int freq(int[] nums, int target) {
		int total = 0;
		for (int ele : nums) {
			if (ele == target)
				total++;
		}
		return total;
	}

	public List<Integer> majorityElement1(int[] nums) {
		int majority1 = Integer.MIN_VALUE;
		int lead1 = 0;

		int majority2 = Integer.MIN_VALUE;
		int lead2 = 0;

		int ptr = 0;

		while (ptr < nums.length) {
			if (nums[ptr] == majority1) {
				lead1++;
			} else if (nums[ptr] == majority2) {
				lead2++;
			} else if (lead1 == 0) {
				majority1 = nums[ptr];
				lead1 = 1;
			} else if (lead2 == 0) {
				majority2 = nums[ptr];
				lead2 = 1;
			} else {
				lead1--;
				lead2--;
			}
			ptr++;
		}

		List<Integer> result = new ArrayList<>();
		if (freq(nums, majority1) > nums.length / 3)
			result.add(majority1);
		if (freq(nums, majority2) > nums.length / 3)
			result.add(majority2);

		return result;
	}

	public List<Integer> majorityElement2(int[] nums) {
		int majority1 = Integer.MIN_VALUE;
		int lead1 = 0;

		int majority2 = Integer.MIN_VALUE;
		int lead2 = 0;

		for (int val : nums) {
			if (majority1 == val) {
				lead1++;
			} else if (majority2 == val) {
				lead2++;
			} else if (lead1 == 0) {
				majority1 = val;
				lead1 = 1;
			} else if (lead2 == 0) {
				majority2 = val;
				lead2 = 1;
			} else {
				lead1--;
				lead2--;
			}
		}

		List<Integer> res = new ArrayList<>();
		if (freq(nums, majority1) > nums.length / 3)
			res.add(majority1);
		if (freq(nums, majority2) > nums.length / 3)
			res.add(majority2);

		return res;
	}
}
