// GfG: https://practice.geeksforgeeks.org/problems/bubble-sort/1

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 6, 9, 2, 4, 1, 0, 3, 5, 7 };
		bubbleSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	/*
	 * Bubble sort does the comparison and swap them so that element pushed/settled
	 * to right part of array (which is sorted part) 
	 * Best Case: O(N^2) Without Optimization, Avg Case/Worst Case: O(N ^ 2) Space -  o(1)
	 * Its stable algorithm
	 * In-Place sorting
	 */
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) { // loop upto the last sorted array
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1); // keep swapping element
			}
		}
	}
	
	// Time: Best Case: O(N) With Optimization, Avg Case/Worst Case: O(N ^ 2)
	 public static void bubbleSort2(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    swap(arr, j, j + 1);
                }
            }
            if (count == 0)   // all elements are sorted no need to perform further oprerations
                break;
        }
    }
	
	//recursive bubble sort
	public static void bubbleSortRec(int[] arr, int idx, int n) {
		if (idx == arr.length - 1)
			return;
		for (int j = 0; j < n - idx - 1; j++) {
			if (arr[j] > arr[j + 1])
				swap(arr, j, j + 1);
		}
		bubbleSortRec(arr, idx + 1, n);

	}

}
