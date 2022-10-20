// Sort Array Leetcode 912:
// https://leetcode.com/problems/sort-an-array/description/

// Time = O(N * Log N), Space = O(N) Extra Space (Not Inplace)
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 9, 6, 2, 1, 2, 3, 29, 43 };
		int[] res = mergeSort(arr, 0, arr.length - 1);
		for (int val : res) {
			System.out.print(val + " ");
		}

	}

	public static int[] mergeSort(int[] nums, int l, int r) {
		if (l == r) {
			int[] res = new int[1];
			res[0] = nums[l];
			return res;
		}

		int mid = (l + r) / 2;
		int[] left = mergeSort(nums, l, mid);
		int[] right = mergeSort(nums, mid + 1, r);
		return merge(left, right);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int idx1 = 0, idx2 = 0, idx3 = 0;

		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				res[idx3] = arr1[idx1];
				idx1++;
				idx3++;
			} else {
				res[idx3] = arr2[idx2];
				idx2++;
				idx3++;
			}
		}

		while (idx1 < arr1.length) {
			res[idx3] = arr1[idx1];
			idx1++;
			idx3++;
		}

		while (idx2 < arr2.length) {
			res[idx3] = arr2[idx2];
			idx2++;
			idx3++;
		}

		return res;
	}

}
