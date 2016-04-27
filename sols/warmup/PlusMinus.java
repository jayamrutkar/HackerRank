package sols.warmup;

import java.text.NumberFormat;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);

		int len = input.nextInt();

		float positiveFraction = 0;
		float negativeFraction = 0;
		float zeroFraction = 0;

		int posSum = 0, negSum = 0, zeroSum = 0;

		long[] arr = new long[len];
		for (int i = 0; i < len; i++) {
			arr[i] = input.nextLong();
			if (arr[i] > 0) {
				posSum++;
			} else if (arr[i] < 0) {
				negSum++;
			} else {
				zeroSum++;
			}
		}

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(6);

		positiveFraction = (float) posSum / (float) len;
		negativeFraction = (float) negSum / (float) len;
		zeroFraction = (float) zeroSum / (float) len;

		System.out.println(nf.format(positiveFraction));
		System.out.println(nf.format(negativeFraction));
		System.out.println(nf.format(zeroFraction));
		input.close();
	}
}
