package sols.impl;

import java.util.Scanner;

public class TaumBirthDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		long[] res = new long[t];

		for (int a0 = 0; a0 < t; a0++) {
			int b = in.nextInt();
			int w = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();

			long b1 = b;
			long w1 = w;
			long x1 = x;
			long y1 = y;
			long z1 = z;

			long total = 0;
			if (z1 >= x1 && z1 >= y1) {
				total += b1 * x1 + w1 * y1;
			} else if (x1 > y1) {
				total += w1 * y1;
				if (z1 > x1 || (y1 + z1) >= x1) {
					total += b1 * x1;
				} else {
					total += (y1 + z1) * b1;
				}
			} else {
				total += b1 * x1;
				if (z1 > y1 || (x1 + z1) >= y1) {
					total += w1 * y1;
				} else {
					total += (x1 + z1) * w1;
				}
			}
			res[a0] = total;
		}

		for (int i = 0; i < t; i++) {
			System.out.println(res[i]);
		}
		in.close();
	}
}
