package sols.impl;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] result = new String[t];

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			boolean cancelled = false;
			int count = 0;

			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
				if (a[a_i] > 0) {
					count++;
				}
			}
			if (count > n - k) {
				cancelled = true;
			}

			if (cancelled) {
				result[a0] = "YES";
			} else {
				result[a0] = "NO";
			}
		}
		for (int m = 0; m < t; m++) {
			System.out.println(result[m]);
		}
		in.close();
	}
}
