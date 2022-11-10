// Leetcode 350: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
// Time: O(N1 + N2), Space = O(N1 + N2) Extra Space

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOf2ArraysII {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };

		int[] res = intersection(arr1, arr2);
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		ArrayList<Integer> common = new ArrayList<>();
		int ptr1 = 0, ptr2 = 0;

		while (ptr1 < nums1.length && ptr2 < nums2.length) {
			if (nums1[ptr1] < nums2[ptr2]) {
				ptr1++;
			} else if (nums1[ptr1] > nums2[ptr2]) {
				ptr2++;
			} else {
				int val = nums1[ptr1];
				// common.add(val);

				while (ptr1 < nums1.length && nums1[ptr1] == val && ptr2 < nums2.length && nums2[ptr2] == val) {
					common.add(val);
					ptr1++;
					ptr2++;
				}
				while (ptr1 < nums1.length && nums1[ptr1] == val) {
					ptr1++;
				}

				while (ptr2 < nums2.length && nums2[ptr2] == val) {
					ptr2++;
				}
			}
		}

		int[] res = new int[common.size()];
		for (int i = 0; i < common.size(); i++)
			res[i] = common.get(i);

		return res;
	}

}
