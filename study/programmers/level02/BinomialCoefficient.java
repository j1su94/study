package programmers.level02;

public class BinomialCoefficient {
	public static void main(String[] args) {
		// 이항계수 -> nCr 공식: n! / r!(n-r)!
		int n = 10;
		int r = 3;
		long top = factorial(n);
		long bottom = factorial(r) * factorial(n-r);

		System.out.println(top / bottom);
	}
	// n!를 계산
	public static long factorial(int n) {
		long result = 1;

		while (n > 1) {
			result *= n;
			n--;
		}

		return result;
	}
}
