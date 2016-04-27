package sols.impl;

import java.util.Scanner;

public class ChocklateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		long result[] = new long[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			long total = n / c;

			if (m >= 2 && c >= 1) {
				long ts = total;
				long res = ts / m;
				total += res;
				long rem = ts % m;

				while ((res + rem) >= m) {
					ts = res + rem;
					res = ts / m;
					if (res > 0) {
						total += res;
					}
					rem = ts % m;
				}
			}
			result[a0] = total;
		}

		for (int k = 0; k < t; k++) {
			System.out.println(result[k]);
		}
		in.close();
	}
}
