
//Merge 2 Sorted Arrays Without Extra Space

//GeeksforGeeks: Insertion Sort
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
//Time = O(n ^ 2), Space = O(1)
class Solution1 {

	public static void swap(long[] arr1, long[] arr2, int i1, int i2) {
		long temp1 = get(arr1, arr2, i1);
		long temp2 = get(arr1, arr2, i2);

		set(arr1, arr2, i1, temp2);
		set(arr1, arr2, i2, temp1);
	}

	// set's element at correct position when logical index and two array passed to
	// it
	public static void set(long[] arr1, long[] arr2, int idx, long element) {
		if (idx < arr1.length)
			arr1[idx] = element;
		else
			arr2[(idx - arr1.length)] = element;
	}

	// returns correct element from logical index and two arrays
	public static long get(long[] arr1, long[] arr2, int idx) {
		if (idx < arr1.length)
			return arr1[idx];
		else
			return arr2[idx - arr1.length];
	}

	// Function to merge the arrays.
	public static void merge(long arr1[], long arr2[], int n1, int n2) {
		// consider the first array as sorted array
		// consider the second array as the unsorted array
		for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
			for (int j = i; j > 0; j--) {
				if (get(arr1, arr2, j) < get(arr1, arr2, j - 1)) { // you cannot use arr[j-1] to get the value since
					swap(arr1, arr2, j, j - 1); // value can be at the first array or at second
												// array so need one more function for this

				} else
					break;
			}
		}

	}

}


// Leetcode: Shell Sort
// 88: https://leetcode.com/problems/merge-sorted-array/
// Time = O(N Log N), Space = O(1)

class Solution {

    public void merge(int[] arr1, int n1, int[] arr2, int n2) {
        //shell sort most efficent approach
        //fill second array elements in empty blocks in first array
        for (int idx = 0; idx < arr2.length; idx++) {
            arr1[idx + n1] = arr2[idx];
        }

        //shell sort (gap strategy)
        for (double gap = (n1 + n2) / 2.0; gap >= 1.0; gap = gap / 2.0) {
            int ceil = (int) Math.ceil(gap);
            gap = ceil;
            for (int i = 0; i + ceil < (n1 + n2); i++) {
                if (arr1[i] > arr1[i + ceil]) {
                    swap(arr1, i, i + ceil);
                }
            }
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
   
}
