package sols.impl;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		long[] res = new long[t];
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			if (n % 2 == 0 && n != 0) {
				res[a0] = (int) Math.pow(2, (n/2)+1)-1;
			} else if (n == 0) {
				res[a0] = 1;
			} else {
				res[a0] = (int) Math.pow(2, ((n+1)/2)+1)-2;
			}
			long out = res[a0];
			System.out.println(out);
		}
		in.close();
    }
}
