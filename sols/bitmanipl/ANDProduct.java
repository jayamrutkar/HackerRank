package sols.bitmanipl;

import java.util.Scanner;

public class ANDProduct {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		long[] result = new long[t];
		for (int i = 0; i < t; i++) {

			long num = in.nextLong();
			long num1 = in.nextLong();

			long res = performAND(num, num1);

			result[i] = res;
		}

		for (int i = 0; i < t; i++) {
			System.out.println(result[i]);
		}
		in.close();
	}

	static long performAND(long n1, long n2) {
		long diff = n2 - n1;
		long base2 = (long) Math.ceil((Math.log(diff)));

		long tnum = n1 >> base2;
		long tnum1 = n2 >> base2;

		long res = 0;
		if (tnum1 - tnum > 1) {
			res = performAND(tnum, tnum1);
		} else {
			res = tnum & tnum1;
		}
		res = res << base2;
		return res;
	}
}
