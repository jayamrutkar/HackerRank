package sols.dynamic;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();

		BigInteger tmp = new BigInteger(String.valueOf(b));
		BigInteger la = new BigInteger(String.valueOf(a));
		BigInteger lb = new BigInteger(String.valueOf(b));
		for (int i = 2; i < n; i++) {
			lb = lb.multiply(lb);
			lb = lb.add(la);
			la = tmp;
			tmp = lb;
		}

		System.out.println(lb);
		in.close();
	}
}
