

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//time complexity o(n) space complexity o(n) ? 
//CTCI

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> duplicatesList = findDuplicates(nums);
	}

	public static List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				result.add(nums[i]);
			} else {
				map.put(nums[i], 0);
			}
		}

		return result;
	}
}
