
//https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
//Time Complexity Log(min(a,b)) + o (1) ?
public class LcmAndGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Long GCD(Long A, Long B) {
		if (B == 0)
			return A;
		return GCD(B, A % B);
	}

	static Long[] LcmAndGcd(Long A, Long B) {
		Long gcd = GCD(A, B);
		Long lcm = (A * B) / gcd;

		return new Long[] { lcm, gcd };
	}

}
