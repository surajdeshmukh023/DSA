package dsa.searching_sorting.searching;

//Leetcode 88: https://leetcode.com/problems/merge-sorted-array/description/

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 0, 0, 0 }; // extra length because we need to modify this and store the result
													// in this array // so don't take arr1.length to get the array
													// length
		int[] arr2 = { 7, 8, 9 };

		int[] res = mergeArrayEff(arr1, 6, arr2, arr2.length);

		for (int val : res) {
			System.out.print(val + " ");
		}

	}

	// Time = O(n1 + n2), Space = O(1) Constant Extra Space
	public static int[] mergeArrayEff(int[] arr1, int n1, int[] arr2, int n2) {
		int ptr1 = n1 - 1, ptr2 = n2 - 1, ptr3 = n1 + n2 - 1;

		while (ptr1 >= 0 && ptr2 >= 0) {
			if (arr1[ptr1] > arr2[ptr2]) {
				arr1[ptr3] = arr1[ptr1];
				ptr1--;
				ptr3--;
			} else {
				arr1[ptr3] = arr2[ptr2];
				ptr2--;
				ptr3--;
			}
		}

		while (ptr1 >= 0) {
			arr1[ptr3] = arr1[ptr1];
			ptr1--;
			ptr3--;
		}
		while (ptr2 >= 0) {
			arr1[ptr3] = arr2[ptr2];
			ptr2--;
			ptr3--;
		}
		return arr1;
	}

	// Time = O(n1 + n2), Space = O(n1 + n2) extra space
	public static int[] mergeArray(int[] arr1, int n1, int[] arr2, int n2) {
		int ptr1 = 0, ptr2 = 0, ptr3 = 0;
		int[] res = new int[n1 + n2];

		while (ptr1 < n1 && ptr2 < n2) {
			if (arr1[ptr1] <= arr2[ptr2]) {
				res[ptr3] = arr1[ptr1];
				ptr1++;
				ptr3++;
			} else {
				res[ptr3] = arr2[ptr2];
				ptr2++;
				ptr3++;
			}
		}

		// If still some elements left in array then add it to end of result array
		while (ptr1 < n1) {
			res[ptr3] = arr1[ptr1];
			ptr1++;
			ptr3++;
		}

		// If still some elements left in array then add it to end of result array
		while (ptr2 < n2) {
			res[ptr3] = arr2[ptr2];
			ptr2++;
			ptr3++;
		}

		for (int i = 0; i < res.length; i++) {
			arr1[i] = res[i];
		}
		return arr1;
	}

}
