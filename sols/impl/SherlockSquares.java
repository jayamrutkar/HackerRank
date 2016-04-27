package sols.impl;

import java.util.Scanner;

public class SherlockSquares {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();

		long[] result = new long[numTests];

		for (int i = 0; i < numTests; i++) {
			long lowerLimit = in.nextLong();
			long upperLimit = in.nextLong();

			long lowerSqRoot = ((Double) Math.ceil(Math.sqrt(lowerLimit)))
					.longValue();
			long upperSqRoot = ((Double) Math.floor(Math.sqrt(upperLimit)))
					.longValue();

			long res = upperSqRoot - lowerSqRoot;

			if (lowerSqRoot != 0 && upperSqRoot != 0 && res >= 0) {
				res = res + 1;
			} else if (res <= -1) {
				res = 0;
			}

			result[i] = res;
		}
		for (int i = 0; i < numTests; i++)
			System.out.println(result[i]);
		
		in.close();
	}
}
