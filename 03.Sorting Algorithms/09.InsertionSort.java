
//GfG: https://practice.geeksforgeeks.org/problems/insertion-sort/1
//Time: Best Case: O(N), Avg Case / Worst Case: O(N ^ 2)
//Space: O(1) Constant or Inplace
//Stable Sorting Algorithm

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 50, 30, 10, 60, 40, 20 };
		insertionSort(arr);
		for (int val : arr)
			System.out.print(val + " ");
	}

	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j])
					swap(arr, j - 1, j);
				else
					break; // best case optimization
			}
		}
	}

}
