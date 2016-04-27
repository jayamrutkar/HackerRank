package sols.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kaprekar {

	private static boolean checkNumber(long n) {
		if (n == 1) {
			return true;
		}
		boolean result = false;
		int nDigits = (int) Math.log10(n) + 1;

		long sq = (long) Math.pow(n, 2);

		String str = String.valueOf(sq);
		int j = str.length();
		int breakNum = j / 2;

		if (j % nDigits == 1) {
			breakNum--;
		}

		if (breakNum > 0) {
			long l1 = Long.parseLong(str.substring(0, breakNum));
			long l2 = Long.parseLong(str.substring(breakNum));
			if (l1 + l2 == n) {
				result = true;
			}
		} else {
			if (n == sq) {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int rangeStart = in.nextInt();
		int rangeEnd = in.nextInt();

		List<Integer> kaprekarNums = new ArrayList<Integer>();

		for (int i = rangeStart; i <= rangeEnd; i++) {
			if (checkNumber(i)) {
				kaprekarNums.add(i);
			}
		}

		if (kaprekarNums.size() == 0) {
			System.out.println("INVALID RANGE");
		} else {
			int k = 0;
			for (Integer num : kaprekarNums) {
				System.out.print(num);
				if (k <= (kaprekarNums.size() - 1)) {
					System.out.print(" ");
				}
			}
		}

		in.close();
	}
}
