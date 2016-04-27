package sols.impl;

import java.util.Scanner;

public class SherlockAndBeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		StringBuilder[] res = new StringBuilder[t];
		for (int i = 0; i < t; i++) {

			int num = in.nextInt();
			res[i] = new StringBuilder("-1");
			if (num > 1) {

				int fives = 0;
				int threes = 0;

				int rem = 0;

				fives = num / 3;
				rem = num % 3;

				while (rem > 0) {

					if (rem % 5 == 0) {
						threes = rem / 5;
						rem = rem % 5;
					}
					if (rem > 0 && fives > 0) {
						fives--;
						rem = rem + 3;
					}
					if (fives == 0) {
						rem = 0;
						if (num % 5 == 0) {
							threes = num / 5;
						}
					}

				}

				StringBuilder str = new StringBuilder();
				while (fives > 0) {
					str.append("555");
					fives--;
				}

				while (threes > 0) {
					str.append("33333");
					threes--;
				}
				if (str.length() > 0 && rem == 0)
					res[i] = str;
			}

		}

		for (int i = 0; i < t; i++) {
			System.out.println(res[i].toString());
		}
		in.close();
	}
}
