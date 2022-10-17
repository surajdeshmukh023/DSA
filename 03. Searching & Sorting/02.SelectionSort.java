

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 6, 9, 2, 4, 1, 0, 3, 5, 7 };
		selectionSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	// https://practice.geeksforgeeks.org/problems/selection-sort/1
	// Worst Case, Average Case, Best Case: O(N ^ 2) Time
	// Space Complexity: O(1) No Extra/Constant Extra Space
	// Not Stable Algorithm
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) { // find element's index who is minimum in remaining array
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			swap(arr, minIndex, i); // swap the minimum element and the current element from left side at
									// consideration Note - swapping done at last
		}
	}
	
	// Recursive selection sort
	public static void selectionSortRec(int[] arr, int idx, int n) {
		if (n == idx)
			return;
		int minIndex = idx;
		for (int j = idx + 1; j < n; j++) { // find element's index who is minimum in remaining array
			if (arr[minIndex] > arr[j])
				minIndex = j;
		}
		swap(arr, minIndex, idx);
		selectionSortRec(arr, idx + 1, n);
	}

}
