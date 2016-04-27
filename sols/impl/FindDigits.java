package sols.impl;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		int[] result = new int[t];

		for (int a0 = 0; a0 < t; a0++) {
			int num = in.nextInt();
			String snum = String.valueOf(num);

			int countr = 0;
			for (int k = 0; k < snum.length(); k++) {
				int digit = Character.getNumericValue(snum.charAt(k));
				if (digit != 0 && num % digit == 0) {
					countr++;
				}
			}
			result[a0] = countr;

		}
		for (int m = 0; m < t; m++) {
			System.out.println(result[m]);
		}
		in.close();
	}
}
