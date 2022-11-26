

//https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1
//Time Complexity 
public class GcdOfAnArray {

	public int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}

	public int gcd(int n, int arr[]) {
		int gcd = arr[0];
		for (int idx = 1; idx < n; idx++) {
			gcd = GCD(gcd, arr[idx]);
		}

		return gcd;
	}

}
