package sols.impl;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int width[] = new int[n];
		int res[] = new int[t];
		for (int width_i = 0; width_i < n; width_i++) {
			width[width_i] = in.nextInt();
		}

		for (int a0 = 0; a0 < t; a0++) {
			int i = in.nextInt();
			int j = in.nextInt();

			int min = 4;
			for (int k = i; k <= j; k++) {
				if (min > width[k]) {
					min = width[k];
				}
			}
			if (min != 4) {
				res[a0] = min;
			}
		}

		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(res[a0]);
		}
		in.close();
	}
}
